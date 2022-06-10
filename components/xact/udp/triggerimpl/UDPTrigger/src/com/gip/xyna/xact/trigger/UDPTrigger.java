/*
 * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * Copyright 2022 GIP SmartMercial GmbH, Germany
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 */
package com.gip.xyna.xact.trigger;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.management.RuntimeErrorException;

import com.gip.xyna.xdev.xfractmod.xmdm.EventListener;
import com.gip.xyna.CentralFactoryLogging;

import org.apache.log4j.Logger;

import com.gip.xyna.xact.exceptions.XACT_TriggerCouldNotBeStartedException;
import com.gip.xyna.xact.exceptions.XACT_TriggerCouldNotBeStoppedException;

public class UDPTrigger extends EventListener<UDPTriggerConnection, UDPStartParameter> {

  private static Logger logger = CentralFactoryLogging.getLogger(UDPTrigger.class);

  private DatagramSocket datagramSocket;  
  private int port;
  
  private InetAddress localAddress;
  
  private static int receiveBufferLength = 2048;
  
  public UDPTrigger() {
  }

  public void start(UDPStartParameter sp) throws XACT_TriggerCouldNotBeStartedException {
    
      logger.debug("### UDPTrigger: Trying to open datagram socket @ "+sp.getLocalAddress()+":"+sp.getLocalPort());
      try {
        this.datagramSocket = new DatagramSocket(sp.getLocalPort(), sp.getLocalAddress());
        this.localAddress = sp.getLocalAddress();
    } catch (SocketException e) {
        throw new RuntimeException("Error while opening the datagram socket ("+sp.getLocalAddress()+":"+sp.getLocalPort()+")!",e);
    }
  }

  public UDPTriggerConnection receive() {
      DatagramPacket datagramPacket = new DatagramPacket(new byte[receiveBufferLength], receiveBufferLength);
      try {
        datagramSocket.receive(datagramPacket);
    } catch (IOException e1) {
        throw new RuntimeException("Error while receiving datagram",e1);
    }
  //    logger.debug("UDPTrigger received Packet");
      logger.debug("UDPTrigger received Packet from "+datagramPacket.getAddress().toString());

      if (localAddress == null) {
        localAddress = datagramSocket.getLocalAddress();
      }
      // return new DHCPTriggerConnection(datagramPacket, currentDhcpOptionConfiguration.clone());
      return new UDPTriggerConnection(datagramPacket, datagramSocket, localAddress);

  }

  /**
   * Called by Xyna Processing if there are not enough system capacities to process the request.
   */
  protected void onProcessingRejected(String cause, UDPTriggerConnection con) {
    // TODO implementation
  }

  /**
   * called by Xyna Processing to stop the Trigger.
   * should make sure, that start() may be called again directly afterwards. connection instances
   * returned by the method receive() should not be expected to work after stop() has been called.
   */
  public void stop() throws XACT_TriggerCouldNotBeStoppedException {
    //TODO implementation
    //TODO update dependency xml file
      datagramSocket.close();
  }

  /**
   * called when a triggerconnection generated by this trigger was not accepted by any filter
   * registered to this trigger
   * @param con corresponding triggerconnection
   */
  public void onNoFilterFound(UDPTriggerConnection con) {
    //TODO implementation
    //TODO update dependency xml file
  }

  /**
   * @return description of this trigger
   */
  public String getClassDescription() {
    return "Receives UDP Packets";
  }

}
