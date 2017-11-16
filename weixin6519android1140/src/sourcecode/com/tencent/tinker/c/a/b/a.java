package com.tencent.tinker.c.a.b;

import com.tencent.tinker.a.a.b.c;
import com.tencent.tinker.a.a.b.d;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class a
{
  public static final byte[] iVB = { 68, 88, 68, 73, 70, 70 };
  public final com.tencent.tinker.a.a.a.a yeZ;
  private short yfa;
  public int yfb;
  private int yfc;
  public int yfd;
  public int yfe;
  public int yff;
  public int yfg;
  public int yfh;
  public int yfi;
  public int yfj;
  public int yfk;
  public int yfl;
  public int yfm;
  public int yfn;
  public int yfo;
  public int yfp;
  public int yfq;
  public int yfr;
  public int yfs;
  public int yft;
  public byte[] yfu;
  
  public a(InputStream paramInputStream)
  {
    this.yeZ = new com.tencent.tinker.a.a.a.a(ByteBuffer.wrap(d.h(paramInputStream)));
    paramInputStream = this.yeZ.Ft(iVB.length);
    if (c.m(paramInputStream, iVB) != 0) {
      throw new IllegalStateException("bad dex patch file magic: " + Arrays.toString(paramInputStream));
    }
    this.yfa = this.yeZ.ycQ.getShort();
    if (c.a(this.yfa, (short)2) != 0) {
      throw new IllegalStateException("bad dex patch file version: " + this.yfa + ", expected: 2");
    }
    this.yfb = this.yeZ.ycQ.getInt();
    this.yfc = this.yeZ.ycQ.getInt();
    this.yfd = this.yeZ.ycQ.getInt();
    this.yfe = this.yeZ.ycQ.getInt();
    this.yff = this.yeZ.ycQ.getInt();
    this.yfg = this.yeZ.ycQ.getInt();
    this.yfh = this.yeZ.ycQ.getInt();
    this.yfi = this.yeZ.ycQ.getInt();
    this.yfj = this.yeZ.ycQ.getInt();
    this.yfk = this.yeZ.ycQ.getInt();
    this.yfl = this.yeZ.ycQ.getInt();
    this.yfm = this.yeZ.ycQ.getInt();
    this.yfn = this.yeZ.ycQ.getInt();
    this.yfo = this.yeZ.ycQ.getInt();
    this.yfp = this.yeZ.ycQ.getInt();
    this.yfq = this.yeZ.ycQ.getInt();
    this.yfr = this.yeZ.ycQ.getInt();
    this.yfs = this.yeZ.ycQ.getInt();
    this.yft = this.yeZ.ycQ.getInt();
    this.yfu = this.yeZ.Ft(20);
    paramInputStream = this.yeZ;
    int i = this.yfc;
    paramInputStream.ycQ.position(i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tinker\c\a\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */