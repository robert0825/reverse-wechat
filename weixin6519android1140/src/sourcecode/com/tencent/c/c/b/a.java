package com.tencent.c.c.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;

public final class a
  extends JceStruct
{
  static c xQK = new c();
  static ArrayList<b> xQL = new ArrayList();
  static d xQM = new d();
  public c xQH = null;
  public ArrayList<b> xQI = null;
  public d xQJ = null;
  
  static
  {
    b localb = new b();
    xQL.add(localb);
  }
  
  public final JceStruct newInit()
  {
    return new a();
  }
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.xQH = ((c)paramJceInputStream.read(xQK, 0, false));
    this.xQI = ((ArrayList)paramJceInputStream.read(xQL, 1, false));
    this.xQJ = ((d)paramJceInputStream.read(xQM, 2, false));
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    if (this.xQH != null) {
      paramJceOutputStream.write(this.xQH, 0);
    }
    if (this.xQI != null) {
      paramJceOutputStream.write(this.xQI, 1);
    }
    if (this.xQJ != null) {
      paramJceOutputStream.write(this.xQJ, 2);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\c\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */