package com.tencent.mm.pluginsdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.mm.ad.f;
import com.tencent.mm.ad.k;
import com.tencent.mm.protocal.c.aos;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.storage.x;

@Deprecated
public abstract interface l
{
  public abstract Bitmap a(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent);
  
  public abstract k a(f paramf);
  
  public abstract void a(Context paramContext, au.a parama, Bundle paramBundle);
  
  public abstract void a(Context paramContext, x paramx, au.a parama, Bundle paramBundle, String paramString);
  
  public abstract void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, String paramString4, String paramString5);
  
  public abstract void a(Context paramContext, String paramString1, String paramString2, String paramString3, long paramLong);
  
  public abstract void a(Intent paramIntent, String paramString);
  
  public abstract void a(aos paramaos, String paramString);
  
  public abstract boolean a(Context paramContext, int paramInt1, int paramInt2, String paramString);
  
  public abstract boolean a(x paramx);
  
  public abstract void al(Context paramContext);
  
  public abstract k at(boolean paramBoolean);
  
  public abstract boolean b(Context paramContext, int paramInt1, int paramInt2, String paramString);
  
  public abstract String bH(String paramString);
  
  public abstract boolean bI(String paramString);
  
  public abstract boolean bJ(String paramString);
  
  public abstract void bK(String paramString);
  
  public abstract boolean d(Activity paramActivity);
  
  public abstract void da(int paramInt);
  
  public abstract void e(Activity paramActivity);
  
  public abstract String f(Context paramContext, String paramString1, String paramString2);
  
  public abstract String j(String paramString, int paramInt);
  
  public abstract String m(Context paramContext, String paramString);
  
  public abstract boolean n(Context paramContext, String paramString);
  
  public abstract void pr();
  
  public abstract void pt();
  
  public abstract void pu();
  
  public abstract Intent pv();
  
  public abstract boolean pw();
  
  public abstract void px();
  
  public abstract boolean py();
  
  public abstract String s(String paramString1, String paramString2);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */