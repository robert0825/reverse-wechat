package com.tencent.mm.plugin.notification.ui;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.app.y.d;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.jz;
import com.tencent.mm.plugin.notification.d.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aj;
import com.tencent.mm.y.at;

@SuppressLint({"InlinedApi"})
public final class FailSendMsgNotification
{
  public boolean kmw;
  public Context mContext;
  private boolean mIsInit;
  private int mType;
  public y.d nza;
  private Intent nzb;
  private int nzc;
  public a nzd;
  public b nze;
  public c nzf;
  public String nzg;
  public String nzh;
  private PendingIntent nzi;
  private PendingIntent nzj;
  private PendingIntent nzk;
  private PendingIntent nzl;
  public boolean nzm;
  public boolean nzn;
  public boolean nzo;
  public Notification rC;
  
  public FailSendMsgNotification()
  {
    GMTrace.i(10732989054976L, 79967);
    this.rC = null;
    this.nza = null;
    this.nzb = null;
    this.nzc = 0;
    this.nzd = null;
    this.nze = null;
    this.nzf = null;
    this.nzg = null;
    this.nzh = null;
    this.nzi = null;
    this.nzj = null;
    this.nzk = null;
    this.nzl = null;
    this.nzm = false;
    this.nzn = false;
    this.kmw = false;
    this.mIsInit = false;
    this.nzo = true;
    GMTrace.o(10732989054976L, 79967);
  }
  
  public FailSendMsgNotification(int paramInt)
  {
    GMTrace.i(10733123272704L, 79968);
    this.rC = null;
    this.nza = null;
    this.nzb = null;
    this.nzc = 0;
    this.nzd = null;
    this.nze = null;
    this.nzf = null;
    this.nzg = null;
    this.nzh = null;
    this.nzi = null;
    this.nzj = null;
    this.nzk = null;
    this.nzl = null;
    this.nzm = false;
    this.nzn = false;
    this.kmw = false;
    this.mIsInit = false;
    this.nzo = true;
    this.mType = paramInt;
    this.mContext = ab.getContext();
    this.nza = new y.d(this.mContext);
    this.nzo = true;
    this.nzh = "";
    try
    {
      if (this.nzo) {
        aUU();
      }
      aUV();
      this.mIsInit = true;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.FailSendMsgNotification", "init FailSendMsgNotification error, e:%s", new Object[] { localException.getMessage() });
        this.mIsInit = false;
        continue;
        boolean bool = false;
      }
    }
    if (this.mContext == null)
    {
      bool = true;
      w.d("MicroMsg.FailSendMsgNotification", "create FailSendMsgNotification, type:%d, context==null:%b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool) });
      this.nzm = false;
      GMTrace.o(10733123272704L, 79968);
      return;
    }
  }
  
  private void aUU()
  {
    GMTrace.i(10733257490432L, 79969);
    this.nza.rx = true;
    Intent localIntent = new Intent();
    if (this.mType == 1)
    {
      localIntent.setAction("com.tencent.failnotification.omit_msg");
      localIntent.setClass(this.mContext, FailSendNormalMsgNotificationService.class);
      localIntent.putExtra("notification_type", this.mType);
      this.nzk = PendingIntent.getService(this.mContext, this.mType, localIntent, 134217728);
      this.nza.a(R.g.aYF, this.mContext.getString(R.l.dMo), this.nzk);
      localIntent = new Intent();
      if (this.mType != 1) {
        break label245;
      }
      localIntent.setAction("com.tencent.failnotificaiton.resend_msg");
      localIntent.setClass(this.mContext, FailSendNormalMsgNotificationService.class);
    }
    for (;;)
    {
      localIntent.putExtra("notification_type", this.mType);
      if (Build.VERSION.SDK_INT >= 16) {
        localIntent.addFlags(268435456);
      }
      this.nzl = PendingIntent.getService(this.mContext, this.mType, localIntent, 134217728);
      this.nza.a(R.g.aYG, this.mContext.getString(R.l.dMp), this.nzl);
      GMTrace.o(10733257490432L, 79969);
      return;
      if (this.mType != 2) {
        break;
      }
      localIntent.setAction("com.tencent.failnotification.omit_sns");
      localIntent.setClass(this.mContext, FailSendSnsMsgNotificationService.class);
      break;
      label245:
      if (this.mType == 2)
      {
        localIntent.setAction("com.tencent.failnotificaiton.resend_sns");
        localIntent.setClass(this.mContext, FailSendSnsMsgNotificationService.class);
      }
    }
  }
  
  public final void Ed(String paramString)
  {
    GMTrace.i(10733525925888L, 79971);
    this.nzg = paramString;
    show();
    GMTrace.o(10733525925888L, 79971);
  }
  
  public final void aUV()
  {
    GMTrace.i(10733391708160L, 79970);
    Object localObject = new Intent();
    if (this.mType == 1)
    {
      ((Intent)localObject).setAction("com.tencent.failnotification.click_msg");
      ((Intent)localObject).setClass(this.mContext, FailSendNormalMsgNotificationService.class);
      ((Intent)localObject).putExtra("notification_type", this.mType);
      this.nzi = PendingIntent.getService(this.mContext, this.mType, (Intent)localObject, 134217728);
      this.nza.rg = this.nzi;
      localObject = new Intent();
      if (this.mType != 1) {
        break label202;
      }
      ((Intent)localObject).setAction("com.tencent.failnotification.dismiss_msg");
      ((Intent)localObject).setClass(this.mContext, FailSendNormalMsgNotificationService.class);
    }
    for (;;)
    {
      ((Intent)localObject).putExtra("notification_type", this.mType);
      this.nzj = PendingIntent.getService(this.mContext, this.mType, (Intent)localObject, 134217728);
      localObject = this.nza;
      PendingIntent localPendingIntent = this.nzj;
      ((y.d)localObject).rC.deleteIntent = localPendingIntent;
      GMTrace.o(10733391708160L, 79970);
      return;
      if (this.mType != 2) {
        break;
      }
      ((Intent)localObject).setAction("com.tencent.failnotification.click_sns");
      ((Intent)localObject).setClass(this.mContext, FailSendSnsMsgNotificationService.class);
      break;
      label202:
      if (this.mType == 2)
      {
        ((Intent)localObject).setAction("com.tencent.failnotification.dismiss_sns");
        ((Intent)localObject).setClass(this.mContext, FailSendSnsMsgNotificationService.class);
      }
    }
  }
  
  public final void aUW()
  {
    GMTrace.i(10733660143616L, 79972);
    w.d("MicroMsg.FailSendMsgNotification", "setIsForeground:%b", new Object[] { Boolean.valueOf(false) });
    this.kmw = false;
    GMTrace.o(10733660143616L, 79972);
  }
  
  public final void aUX()
  {
    GMTrace.i(10734062796800L, 79975);
    this.nza.b(2, false);
    this.nzn = false;
    show();
    w.d("MicroMsg.FailSendMsgNotification", "FailSendMsgNotification, unLockInNotificationBar");
    GMTrace.o(10734062796800L, 79975);
  }
  
  public final void aUY()
  {
    GMTrace.i(10734197014528L, 79976);
    this.nzo = true;
    this.nza = new y.d(this.mContext);
    aUU();
    aUV();
    GMTrace.o(10734197014528L, 79976);
  }
  
  public final void dismiss()
  {
    GMTrace.i(10733928579072L, 79974);
    at.getNotification().cancel(this.mType);
    Intent localIntent = new Intent();
    if (this.mType == 1)
    {
      localIntent.setClass(this.mContext, FailSendNormalMsgNotificationService.class);
      this.mContext.stopService(localIntent);
    }
    for (;;)
    {
      this.kmw = false;
      this.nzm = false;
      GMTrace.o(10733928579072L, 79974);
      return;
      if (this.mType == 2)
      {
        localIntent.setClass(this.mContext, FailSendSnsMsgNotificationService.class);
        this.mContext.stopService(localIntent);
      }
    }
  }
  
  @TargetApi(16)
  public final void show()
  {
    GMTrace.i(10733794361344L, 79973);
    if (!this.mIsInit)
    {
      w.e("MicroMsg.FailSendMsgNotification", "when show notification, is not init yet");
      GMTrace.o(10733794361344L, 79973);
      return;
    }
    this.nza.c(this.nzh);
    this.nza.a(this.mContext.getText(R.l.app_name));
    y.d locald = this.nza;
    if (Build.VERSION.SDK_INT < 19) {}
    for (int i = R.g.aYC;; i = R.g.aYD)
    {
      locald.L(i);
      this.nza.b(this.nzg);
      this.nza.o(false);
      this.rC = this.nza.build();
      if ((Build.VERSION.SDK_INT >= 16) && (!this.kmw))
      {
        this.rC.priority = 2;
        w.d("MicroMsg.FailSendMsgNotification", "show notification, set priority to max");
      }
      w.d("MicroMsg.FailSendMsgNotification", "show notification, mIsForeground:%b", new Object[] { Boolean.valueOf(this.kmw) });
      at.getNotification().a(this.mType, this.rC, false);
      this.nzm = true;
      GMTrace.o(10733794361344L, 79973);
      return;
    }
  }
  
  public static abstract class FailSendMsgNotificationService
    extends Service
  {
    protected com.tencent.mm.sdk.b.c nzp;
    protected FailSendMsgNotification nzq;
    
    public FailSendMsgNotificationService()
    {
      GMTrace.i(10734465449984L, 79978);
      this.nzp = new com.tencent.mm.sdk.b.c() {};
      this.nzq = null;
      GMTrace.o(10734465449984L, 79978);
    }
    
    protected abstract int aUZ();
    
    public IBinder onBind(Intent paramIntent)
    {
      GMTrace.i(10734868103168L, 79981);
      GMTrace.o(10734868103168L, 79981);
      return null;
    }
    
    public void onCreate()
    {
      GMTrace.i(10734733885440L, 79980);
      super.onCreate();
      w.d("MicroMsg.FailSendMsgNotification", "onCreate FailSendMsgNotificationService");
      com.tencent.mm.sdk.b.a.vgX.b(this.nzp);
      GMTrace.o(10734733885440L, 79980);
    }
    
    public void onDestroy()
    {
      GMTrace.i(10735136538624L, 79983);
      super.onDestroy();
      w.d("MicroMsg.FailSendMsgNotification", "onDestroy FailSendMsgNotificationService");
      com.tencent.mm.sdk.b.a.vgX.c(this.nzp);
      GMTrace.o(10735136538624L, 79983);
    }
    
    @TargetApi(16)
    public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
    {
      GMTrace.i(10735002320896L, 79982);
      w.d("MicroMsg.FailSendMsgNotification", "onStartCommand");
      if ((paramIntent == null) || (paramIntent.getExtras() == null))
      {
        w.d("MicroMsg.FailSendMsgNotification", "handle action button, intent is null");
        GMTrace.o(10735002320896L, 79982);
        return 2;
      }
      String str = paramIntent.getAction();
      if (bg.nm(str))
      {
        w.d("MicroMsg.FailSendMsgNotification", "handle action button, action is null");
        GMTrace.o(10735002320896L, 79982);
        return 2;
      }
      paramInt1 = paramIntent.getExtras().getInt("notification_type", -1);
      w.d("MicroMsg.FailSendMsgNotification", "handle action button, type:%d", new Object[] { Integer.valueOf(paramInt1) });
      if (e.sd(paramInt1) == null)
      {
        w.d("MicroMsg.FailSendMsgNotification", "handle action button, notification not exist");
        GMTrace.o(10735002320896L, 79982);
        return 2;
      }
      w.d("MicroMsg.FailSendMsgNotification", "action:%s", new Object[] { str });
      this.nzq = e.sd(paramInt1);
      if (str.startsWith("com.tencent.failnotification.omit"))
      {
        if (this.nzq.nzd != null)
        {
          w.d("MicroMsg.FailSendMsgNotification", "handle omit action button, type:%d", new Object[] { Integer.valueOf(paramInt1) });
          this.nzq.nzd.aUK();
          GMTrace.o(10735002320896L, 79982);
          return 2;
        }
      }
      else if (str.startsWith("com.tencent.failnotificaiton.resend"))
      {
        if (this.nzq.nzd != null)
        {
          boolean bool1;
          if (this.nzq.rC == null)
          {
            bool1 = true;
            if (this.nzq.nza != null) {
              break label410;
            }
          }
          label410:
          for (boolean bool2 = true;; bool2 = false)
          {
            w.d("MicroMsg.FailSendMsgNotification", "handle resend action button, type:%d, notification==null:%b, notificationBuilder==null:%b", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
            if (this.nzq != null) {
              this.nzq.kmw = true;
            }
            if ((this.nzq.rC != null) && (Build.VERSION.SDK_INT >= 16)) {
              this.nzq.rC.priority = 0;
            }
            if (this.nzq.rC == null) {
              this.nzq.show();
            }
            startForeground(paramInt1, this.nzq.rC);
            this.nzq.nzd.aUJ();
            w.d("MicroMsg.FailSendMsgNotification", "finish handle resend action button, type:%d", new Object[] { Integer.valueOf(paramInt1) });
            GMTrace.o(10735002320896L, 79982);
            return 2;
            bool1 = false;
            break;
          }
        }
      }
      else if (str.startsWith("com.tencent.failnotification.click"))
      {
        if (this.nzq.nze != null)
        {
          w.d("MicroMsg.FailSendMsgNotification", "handle click notification, type:%d", new Object[] { Integer.valueOf(paramInt1) });
          this.nzq.nze.aUL();
          GMTrace.o(10735002320896L, 79982);
          return 2;
        }
      }
      else if (str.startsWith("com.tencent.failnotification.dismiss"))
      {
        this.nzq.nzm = false;
        this.nzq.kmw = false;
        if (this.nzq.nzf != null)
        {
          w.d("MicroMsg.FailSendMsgNotification", "handle notification dismiss");
          this.nzq.nzf.onDismiss();
        }
        stopSelf();
      }
      GMTrace.o(10735002320896L, 79982);
      return 2;
    }
  }
  
  public static class FailSendNormalMsgNotificationService
    extends FailSendMsgNotification.FailSendMsgNotificationService
  {
    public FailSendNormalMsgNotificationService()
    {
      GMTrace.i(10735807627264L, 79988);
      GMTrace.o(10735807627264L, 79988);
    }
    
    protected final int aUZ()
    {
      GMTrace.i(10735941844992L, 79989);
      GMTrace.o(10735941844992L, 79989);
      return 1;
    }
  }
  
  public static class FailSendSnsMsgNotificationService
    extends FailSendMsgNotification.FailSendMsgNotificationService
  {
    public FailSendSnsMsgNotificationService()
    {
      GMTrace.i(10735539191808L, 79986);
      GMTrace.o(10735539191808L, 79986);
    }
    
    protected final int aUZ()
    {
      GMTrace.i(10735673409536L, 79987);
      GMTrace.o(10735673409536L, 79987);
      return 2;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\notification\ui\FailSendMsgNotification.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */