package com.tencent.mm.g.a;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.b.b;

public final class ey
  extends b
{
  public a eGX;
  public b eGY;
  
  public ey()
  {
    this((byte)0);
    GMTrace.i(4359123369984L, 32478);
    GMTrace.o(4359123369984L, 32478);
  }
  
  private ey(byte paramByte)
  {
    GMTrace.i(4359257587712L, 32479);
    this.eGX = new a();
    this.eGY = new b();
    this.vhd = false;
    this.eDO = null;
    GMTrace.o(4359257587712L, 32479);
  }
  
  public static final class a
  {
    public Context context;
    public String[] eAc;
    public int eGs;
    public String[] selectionArgs;
    public Uri uri;
    
    public a()
    {
      GMTrace.i(4374692626432L, 32594);
      this.eGs = 0;
      GMTrace.o(4374692626432L, 32594);
    }
  }
  
  public static final class b
  {
    public Cursor eGt;
    
    public b()
    {
      GMTrace.i(4311073423360L, 32120);
      GMTrace.o(4311073423360L, 32120);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\g\a\ey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */