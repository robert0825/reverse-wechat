package com.tencent.mm.pluginsdk.model.app;

import android.net.Uri;
import com.tencent.gmtrace.GMTrace;

public final class ap
{
  public static ap tpg;
  public static long tph;
  public int code;
  public String[] projection;
  public String selection;
  public String[] selectionArgs;
  public String tpe;
  public String[] tpf;
  public Uri uri;
  
  static
  {
    GMTrace.i(792153030656L, 5902);
    tpg = null;
    tph = -1L;
    GMTrace.o(792153030656L, 5902);
  }
  
  public ap(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, int paramInt, String[] paramArrayOfString3)
  {
    GMTrace.i(792018812928L, 5901);
    this.uri = null;
    this.projection = null;
    this.selection = "";
    this.selectionArgs = null;
    this.tpe = "";
    this.code = -1;
    this.tpf = null;
    this.uri = paramUri;
    this.projection = paramArrayOfString1;
    this.selection = paramString1;
    this.selectionArgs = paramArrayOfString2;
    this.tpe = paramString2;
    this.code = paramInt;
    this.tpf = paramArrayOfString3;
    GMTrace.o(792018812928L, 5901);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */