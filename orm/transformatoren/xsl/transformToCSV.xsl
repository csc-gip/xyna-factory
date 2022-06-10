<!--
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
-->
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="text" encoding="iso-8859-1" />
<xsl:template match="DBObject"><xsl:text>
</xsl:text>Tabelle <xsl:value-of select="@aliasName"/> (SQL : <xsl:value-of select="@name"/><xsl:text>)
</xsl:text><xsl:value-of select="@descr"/>
Attribut;Datentyp;Laenge;Beschreibung;Not Null Constraint;Foreign Key
<xsl:for-each select="Column">
<xsl:text></xsl:text>
<xsl:value-of select="@name"/>
<xsl:text>;</xsl:text> <xsl:value-of select="@type"/>
<xsl:text>;</xsl:text>
<xsl:value-of select="@length"/>
<xsl:text>;</xsl:text>
<xsl:value-of select="@descr"/>
<xsl:text>;</xsl:text>
<xsl:if test="@nullable='N'">
<xsl:choose>
<xsl:when test="@nnConstrName">
  <xsl:value-of select="@nnConstrName"/>
</xsl:when>
<xsl:otherwise>
<xsl:choose>
<xsl:when test="@descr='PRIMARY KEY'">Primary Key</xsl:when>
<xsl:otherwise>FEHLT</xsl:otherwise>
</xsl:choose>
</xsl:otherwise>
</xsl:choose>
</xsl:if>
<xsl:text>;</xsl:text>
<xsl:variable name="colname" select="@name"></xsl:variable>
<xsl:for-each select="/DBObject/Constraint">
<xsl:if test="@type='FK'">
<xsl:if test="@columnList=$colname">
  <xsl:value-of select="@refTable"/>.<xsl:value-of select="@refcolumnList"/>
</xsl:if>
</xsl:if>
</xsl:for-each>

<xsl:text>
</xsl:text>
</xsl:for-each>
<xsl:text>
</xsl:text>
<xsl:for-each select="/DBObject/Constraint">
<xsl:if test="@type='U'">Unique(<xsl:value-of select="@columnList"/>)
</xsl:if>
</xsl:for-each>
<xsl:for-each select="/DBObject/Constraint">
<xsl:if test="@type='C'">Check(<xsl:value-of select="@searchCond"/>)
</xsl:if>
</xsl:for-each>

</xsl:template>
</xsl:stylesheet>
