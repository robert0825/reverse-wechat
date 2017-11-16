package com.tencent.c.e.a.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class c
  extends JceStruct
{
  public int errCode = 0;
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.errCode = paramJceInputStream.read(this.errCode, 0, false);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    if (this.errCode != 0) {
      paramJceOutputStream.write(this.errCode, 0);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\e\a\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */