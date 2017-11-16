package com.tencent.mm.g.a;

import android.content.Context;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.b.b;
import java.util.ArrayList;

public final class km
  extends b
{
  public a eOE;
  public b eOF;
  
  public km()
  {
    this((byte)0);
    GMTrace.i(4271881846784L, 31828);
    GMTrace.o(4271881846784L, 31828);
  }
  
  private km(byte paramByte)
  {
    GMTrace.i(4272016064512L, 31829);
    this.eOE = new a();
    this.eOF = new b();
    this.vhd = false;
    this.eDO = null;
    GMTrace.o(4272016064512L, 31829);
  }
  
  public static final class a
  {
    public Context context;
    public String eOG;
    public String eOH;
    public boolean eOI;
    public Bundle eOJ;
    public int eOK;
    public int eOL;
    public ArrayList eOM;
    public boolean eON;
    public tt field_favProto;
    public long field_localId;
    public String path;
    public int type;
    
    public a()
    {
      GMTrace.i(4370934530048L, 32566);
      this.type = 0;
      this.field_localId = 0L;
      this.eOI = false;
      this.eOK = 0;
      this.eOL = 0;
      this.eON = true;
      GMTrace.o(4370934530048L, 32566);
    }
  }
  
  public static final class b
  {
    public String path;
    public int ret;
    
    public b()
    {
      GMTrace.i(4370129223680L, 32560);
      this.ret = 0;
      GMTrace.o(4370129223680L, 32560);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\a\km.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */