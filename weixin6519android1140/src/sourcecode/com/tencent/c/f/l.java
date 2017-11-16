package com.tencent.c.f;

import com.qq.taf.RequestPacket;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceUtil;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Set;

public final class l
{
  static HashMap<String, byte[]> xTd = null;
  protected String xSZ = "UTF-8";
  protected RequestPacket xTa = new RequestPacket();
  protected HashMap<String, byte[]> xTb = new HashMap();
  private HashMap<String, Object> xTc = new HashMap();
  
  public l()
  {
    this.xTa.iVersion = 3;
  }
  
  public final void XY(String paramString)
  {
    this.xSZ = paramString;
  }
  
  public final void XZ(String paramString)
  {
    this.xTa.sServantName = paramString;
  }
  
  public final void Ya(String paramString)
  {
    this.xTa.sFuncName = paramString;
  }
  
  public final void cnK()
  {
    this.xTa.iRequestId = 3;
  }
  
  public final byte[] oO()
  {
    if (this.xTa.sServantName == null) {
      this.xTa.sServantName = "";
    }
    if (this.xTa.sFuncName == null) {
      this.xTa.sFuncName = "";
    }
    Object localObject = new JceOutputStream(0);
    ((JceOutputStream)localObject).setServerEncoding(this.xSZ);
    ((JceOutputStream)localObject).write(this.xTb, 0);
    this.xTa.sBuffer = JceUtil.getJceBufArray(((JceOutputStream)localObject).getByteBuffer());
    localObject = new JceOutputStream(0);
    ((JceOutputStream)localObject).setServerEncoding(this.xSZ);
    this.xTa.writeTo((JceOutputStream)localObject);
    localObject = JceUtil.getJceBufArray(((JceOutputStream)localObject).getByteBuffer());
    int i = localObject.length;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i + 4);
    localByteBuffer.putInt(i + 4).put((byte[])localObject).flip();
    return localByteBuffer.array();
  }
  
  public final <T> void put(String paramString, T paramT)
  {
    if ((paramString.startsWith(".")) || (paramT == null) || ((paramT instanceof Set))) {
      throw new IllegalArgumentException("wup put err");
    }
    JceOutputStream localJceOutputStream = new JceOutputStream();
    localJceOutputStream.setServerEncoding(this.xSZ);
    localJceOutputStream.write(paramT, 0);
    paramT = JceUtil.getJceBufArray(localJceOutputStream.getByteBuffer());
    this.xTb.put(paramString, paramT);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\f\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */