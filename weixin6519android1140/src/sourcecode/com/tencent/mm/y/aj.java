package com.tencent.mm.y;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;

public abstract interface aj
  extends al
{
  public abstract int a(Notification paramNotification, boolean paramBoolean);
  
  public abstract Notification a(Notification paramNotification, int paramInt1, int paramInt2, PendingIntent paramPendingIntent, String paramString1, String paramString2, String paramString3, Bitmap paramBitmap, String paramString4);
  
  public abstract Notification a(Notification paramNotification, int paramInt1, PendingIntent paramPendingIntent1, String paramString1, String paramString2, String paramString3, Bitmap paramBitmap, int paramInt2, String paramString4, PendingIntent paramPendingIntent2, int paramInt3, String paramString5, PendingIntent paramPendingIntent3, String paramString6);
  
  public abstract Notification a(PendingIntent paramPendingIntent, String paramString1, String paramString2, String paramString3, Bitmap paramBitmap, String paramString4);
  
  public abstract void a(int paramInt, Notification paramNotification, boolean paramBoolean);
  
  public abstract void aE(boolean paramBoolean);
  
  public abstract void aF(boolean paramBoolean);
  
  public abstract int b(Notification paramNotification);
  
  public abstract void cancel(int paramInt);
  
  public abstract void cancelNotification(String paramString);
  
  public abstract void dT(int paramInt);
  
  public abstract void dU(int paramInt);
  
  public abstract void dV(int paramInt);
  
  public abstract void dv(String paramString);
  
  public abstract void dw(String paramString);
  
  public abstract void i(int paramInt, String paramString);
  
  public abstract void m(String paramString, int paramInt);
  
  public abstract void notify(int paramInt, Notification paramNotification);
  
  public abstract void pu();
  
  public abstract void rA();
  
  public abstract void rB();
  
  public abstract String rx();
  
  public abstract void ry();
  
  public abstract boolean rz();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */