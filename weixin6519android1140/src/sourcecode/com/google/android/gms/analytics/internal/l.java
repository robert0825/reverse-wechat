package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

public final class l
  extends o
{
  protected boolean abH;
  protected String abS;
  protected String abT;
  protected int abV;
  protected boolean acC;
  protected int acD;
  protected boolean acE;
  protected boolean acF;
  
  public l(q paramq)
  {
    super(paramq);
  }
  
  public final int getLogLevel()
  {
    iC();
    return this.acD;
  }
  
  protected final void hS()
  {
    Object localObject1 = this.ack.mContext;
    Object localObject2;
    try
    {
      localObject1 = ((Context)localObject1).getPackageManager().getApplicationInfo(((Context)localObject1).getPackageName(), 129);
      if (localObject1 == null)
      {
        Q("Couldn't get ApplicationInfo to load global config");
        return;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      do
      {
        do
        {
          do
          {
            for (;;)
            {
              e("PackageManager doesn't know about the app package", localNameNotFoundException);
              localObject2 = null;
            }
            localObject2 = ((ApplicationInfo)localObject2).metaData;
          } while (localObject2 == null);
          i = ((Bundle)localObject2).getInt("com.google.android.gms.analytics.globalConfigResource");
        } while (i <= 0);
        localObject2 = (b)new ak(this.ack).bO(i);
      } while (localObject2 == null);
      N("Loading global XML config values");
      if (((b)localObject2).abS == null) {
        break label298;
      }
    }
    int i = 1;
    label105:
    String str;
    if (i != 0)
    {
      str = ((b)localObject2).abS;
      this.abS = str;
      d("XML config - app name", str);
    }
    if (((b)localObject2).abT != null)
    {
      i = 1;
      label138:
      if (i != 0)
      {
        str = ((b)localObject2).abT;
        this.abT = str;
        d("XML config - app version", str);
      }
      if (((b)localObject2).abU == null) {
        break label308;
      }
      i = 1;
      label171:
      if (i != 0)
      {
        str = ((b)localObject2).abU.toLowerCase();
        if (!"verbose".equals(str)) {
          break label313;
        }
        i = 0;
        label196:
        if (i >= 0)
        {
          this.acD = i;
          c("XML config - log level", Integer.valueOf(i));
        }
      }
      if (((b)localObject2).abV < 0) {
        break label363;
      }
      i = 1;
      label224:
      if (i != 0)
      {
        i = ((b)localObject2).abV;
        this.abV = i;
        this.acE = true;
        d("XML config - dispatch period (sec)", Integer.valueOf(i));
      }
      if (((b)localObject2).abW == -1) {
        break label368;
      }
      i = 1;
      label263:
      if (i == 0) {
        break label371;
      }
      if (((b)localObject2).abW != 1) {
        break label373;
      }
    }
    label298:
    label308:
    label313:
    label363:
    label368:
    label371:
    label373:
    for (boolean bool = true;; bool = false)
    {
      this.abH = bool;
      this.acF = true;
      d("XML config - dry run", Boolean.valueOf(bool));
      return;
      i = 0;
      break label105;
      i = 0;
      break label138;
      i = 0;
      break label171;
      if ("info".equals(str))
      {
        i = 1;
        break label196;
      }
      if ("warning".equals(str))
      {
        i = 2;
        break label196;
      }
      if ("error".equals(str))
      {
        i = 3;
        break label196;
      }
      i = -1;
      break label196;
      i = 0;
      break label224;
      i = 0;
      break label263;
      break;
    }
  }
  
  public final String io()
  {
    iC();
    return this.abT;
  }
  
  public final String ip()
  {
    iC();
    return this.abS;
  }
  
  public final boolean iq()
  {
    iC();
    return this.acC;
  }
  
  public final boolean ir()
  {
    iC();
    return this.acE;
  }
  
  public final int is()
  {
    iC();
    return this.abV;
  }
  
  public final boolean it()
  {
    iC();
    return this.acF;
  }
  
  public final boolean iu()
  {
    iC();
    return this.abH;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */