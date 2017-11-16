package com.google.android.gms.common.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.b.a;
import com.google.android.gms.b.c;
import com.google.android.gms.b.c.a;

public final class b
  extends c<u>
{
  private static final b akl = new b();
  
  private b()
  {
    super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
  }
  
  public static View a(Context paramContext, int paramInt1, int paramInt2)
  {
    return akl.b(paramContext, paramInt1, paramInt2);
  }
  
  private View b(Context paramContext, int paramInt1, int paramInt2)
  {
    try
    {
      a locala = com.google.android.gms.b.b.ab(paramContext);
      paramContext = (View)com.google.android.gms.b.b.a(((u)D(paramContext)).a(locala, paramInt1, paramInt2));
      return paramContext;
    }
    catch (Exception paramContext)
    {
      throw new c.a("Could not get button with size " + paramInt1 + " and color " + paramInt2, paramContext);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\common\internal\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */