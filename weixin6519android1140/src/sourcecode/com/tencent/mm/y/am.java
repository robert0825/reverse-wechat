package com.tencent.mm.y;

import android.os.Bundle;
import android.os.Looper;
import com.tencent.mm.storage.au;
import java.util.List;

public abstract interface am
{
  public abstract void a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Bundle paramBundle);
  
  public abstract void a(au paramau);
  
  public abstract Looper getLooper();
  
  public abstract void q(List<au> paramList);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */