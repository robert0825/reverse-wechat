package com.tencent.c.e.a.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class g
  extends JceStruct
{
  static Map<Integer, ArrayList<f>> xSR;
  public long xSO = 0L;
  public Map<Integer, ArrayList<f>> xSP = null;
  public int xSQ = 0;
  public int xSt = 0;
  public int xSu = 0;
  public int xSv = 0;
  public int xSw = 0;
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.xSO = paramJceInputStream.read(this.xSO, 0, true);
    if (xSR == null)
    {
      xSR = new HashMap();
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(new f());
      xSR.put(Integer.valueOf(0), localArrayList);
    }
    this.xSP = ((Map)paramJceInputStream.read(xSR, 1, true));
    this.xSt = paramJceInputStream.read(this.xSt, 2, false);
    this.xSu = paramJceInputStream.read(this.xSu, 3, false);
    this.xSv = paramJceInputStream.read(this.xSv, 4, false);
    this.xSw = paramJceInputStream.read(this.xSw, 5, false);
    this.xSQ = paramJceInputStream.read(this.xSQ, 6, false);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.xSO, 0);
    paramJceOutputStream.write(this.xSP, 1);
    paramJceOutputStream.write(this.xSt, 2);
    paramJceOutputStream.write(this.xSu, 3);
    paramJceOutputStream.write(this.xSv, 4);
    paramJceOutputStream.write(this.xSw, 5);
    if (this.xSQ != 0) {
      paramJceOutputStream.write(this.xSQ, 6);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\e\a\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */