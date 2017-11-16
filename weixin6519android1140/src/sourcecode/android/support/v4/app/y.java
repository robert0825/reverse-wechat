package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class y
{
  public static final i qX = new l();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      qX = new k();
      return;
    }
    if (Build.VERSION.SDK_INT >= 20)
    {
      qX = new j();
      return;
    }
    if (Build.VERSION.SDK_INT >= 19)
    {
      qX = new q();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      qX = new p();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      qX = new o();
      return;
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      qX = new n();
      return;
    }
    if (Build.VERSION.SDK_INT >= 9)
    {
      qX = new m();
      return;
    }
  }
  
  public static Bundle a(Notification paramNotification)
  {
    return qX.a(paramNotification);
  }
  
  public static void a(w paramw, ArrayList<a> paramArrayList)
  {
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext()) {
      paramw.a((a)paramArrayList.next());
    }
  }
  
  public static void a(x paramx, r paramr)
  {
    if (paramr != null)
    {
      if (!(paramr instanceof c)) {
        break label37;
      }
      paramr = (c)paramr;
      ad.a(paramx, paramr.rP, paramr.rR, paramr.rQ, paramr.rd);
    }
    label37:
    do
    {
      return;
      if ((paramr instanceof h))
      {
        paramr = (h)paramr;
        ad.a(paramx, paramr.rP, paramr.rR, paramr.rQ, paramr.rO);
        return;
      }
    } while (!(paramr instanceof b));
    paramr = (b)paramr;
    ad.a(paramx, paramr.rP, paramr.rR, paramr.rQ, paramr.ra, paramr.rb, paramr.rc);
  }
  
  public static final class a
    extends ab.a
  {
    public static final ab.a.a qZ = new ab.a.a() {};
    public PendingIntent actionIntent;
    public int icon;
    public final Bundle mExtras;
    private final ag[] qY;
    public CharSequence title;
    
    public a(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
    {
      this(paramInt, paramCharSequence, paramPendingIntent, new Bundle());
    }
    
    private a(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent, Bundle paramBundle)
    {
      this.icon = paramInt;
      this.title = y.d.d(paramCharSequence);
      this.actionIntent = paramPendingIntent;
      this.mExtras = paramBundle;
      this.qY = null;
    }
    
    public final PendingIntent bk()
    {
      return this.actionIntent;
    }
    
    public final Bundle getExtras()
    {
      return this.mExtras;
    }
    
    public final int getIcon()
    {
      return this.icon;
    }
    
    public final CharSequence getTitle()
    {
      return this.title;
    }
  }
  
  public static final class b
    extends y.r
  {
    Bitmap ra;
    Bitmap rb;
    boolean rc;
  }
  
  public static final class c
    extends y.r
  {
    CharSequence rd;
  }
  
  public static final class d
  {
    public Context mContext;
    Bundle mExtras;
    int mPriority;
    int rA = 0;
    Notification rB;
    public Notification rC = new Notification();
    public ArrayList<String> rD;
    public CharSequence re;
    public CharSequence rf;
    public PendingIntent rg;
    PendingIntent rh;
    RemoteViews ri;
    public Bitmap rj;
    public CharSequence rk;
    public int rl;
    boolean rm = true;
    public boolean rn;
    public y.r ro;
    public CharSequence rp;
    int rq;
    int rr;
    boolean rs;
    String rt;
    boolean ru;
    String rv;
    public ArrayList<y.a> rw = new ArrayList();
    public boolean rx = false;
    public String ry;
    int rz = 0;
    
    public d(Context paramContext)
    {
      this.mContext = paramContext;
      this.rC.when = System.currentTimeMillis();
      this.rC.audioStreamType = -1;
      this.mPriority = 0;
      this.rD = new ArrayList();
    }
    
    protected static CharSequence d(CharSequence paramCharSequence)
    {
      if (paramCharSequence == null) {}
      while (paramCharSequence.length() <= 5120) {
        return paramCharSequence;
      }
      return paramCharSequence.subSequence(0, 5120);
    }
    
    public final d L(int paramInt)
    {
      this.rC.icon = paramInt;
      return this;
    }
    
    public final d a(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      this.rq = paramInt1;
      this.rr = paramInt2;
      this.rs = paramBoolean;
      return this;
    }
    
    public final d a(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
    {
      this.rw.add(new y.a(paramInt, paramCharSequence, paramPendingIntent));
      return this;
    }
    
    public final d a(CharSequence paramCharSequence)
    {
      this.re = d(paramCharSequence);
      return this;
    }
    
    public final d b(CharSequence paramCharSequence)
    {
      this.rf = d(paramCharSequence);
      return this;
    }
    
    public final void b(int paramInt, boolean paramBoolean)
    {
      if (paramBoolean)
      {
        localNotification = this.rC;
        localNotification.flags |= paramInt;
        return;
      }
      Notification localNotification = this.rC;
      localNotification.flags &= (paramInt ^ 0xFFFFFFFF);
    }
    
    public final Notification build()
    {
      y.i locali = y.qX;
      new y.e();
      return locali.b(this);
    }
    
    public final d c(long paramLong)
    {
      this.rC.when = paramLong;
      return this;
    }
    
    public final d c(CharSequence paramCharSequence)
    {
      this.rC.tickerText = d(paramCharSequence);
      return this;
    }
    
    @Deprecated
    public final Notification getNotification()
    {
      return build();
    }
    
    public final d o(boolean paramBoolean)
    {
      b(16, paramBoolean);
      return this;
    }
  }
  
  protected static final class e {}
  
  public static final class f
    implements y.g
  {
    public a rE;
    private Bitmap rj;
    private int rz = 0;
    
    public final y.d a(y.d paramd)
    {
      if (Build.VERSION.SDK_INT < 21) {
        return paramd;
      }
      Bundle localBundle = new Bundle();
      if (this.rj != null) {
        localBundle.putParcelable("large_icon", this.rj);
      }
      if (this.rz != 0) {
        localBundle.putInt("app_color", this.rz);
      }
      if (this.rE != null) {
        localBundle.putBundle("car_conversation", y.qX.a(this.rE));
      }
      if (paramd.mExtras == null) {
        paramd.mExtras = new Bundle();
      }
      paramd.mExtras.putBundle("android.car.EXTENSIONS", localBundle);
      return paramd;
    }
    
    public static final class a
      extends ab.b
    {
      static final ab.b.a rL = new ab.b.a() {};
      private final String[] rF;
      private final ag rG;
      private final PendingIntent rH;
      private final PendingIntent rI;
      private final String[] rJ;
      private final long rK;
      
      public a(String[] paramArrayOfString1, ag paramag, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2, String[] paramArrayOfString2, long paramLong)
      {
        this.rF = paramArrayOfString1;
        this.rG = paramag;
        this.rI = paramPendingIntent2;
        this.rH = paramPendingIntent1;
        this.rJ = paramArrayOfString2;
        this.rK = paramLong;
      }
      
      public final long getLatestTimestamp()
      {
        return this.rK;
      }
      
      public final String[] getMessages()
      {
        return this.rF;
      }
      
      public final String[] getParticipants()
      {
        return this.rJ;
      }
      
      public final PendingIntent getReadPendingIntent()
      {
        return this.rI;
      }
      
      public final PendingIntent getReplyPendingIntent()
      {
        return this.rH;
      }
      
      public static final class a
      {
        public ag rG;
        public PendingIntent rH;
        public PendingIntent rI;
        public long rK;
        public final List<String> rM = new ArrayList();
        public final String rN;
        
        public a(String paramString)
        {
          this.rN = paramString;
        }
      }
    }
  }
  
  public static abstract interface g
  {
    public abstract y.d a(y.d paramd);
  }
  
  public static final class h
    extends y.r
  {
    ArrayList<CharSequence> rO = new ArrayList();
  }
  
  static abstract interface i
  {
    public abstract Bundle a(Notification paramNotification);
    
    public abstract Bundle a(ab.b paramb);
    
    public abstract Notification b(y.d paramd);
  }
  
  static class j
    extends y.q
  {
    public Notification b(y.d paramd)
    {
      z.a locala = new z.a(paramd.mContext, paramd.rC, paramd.re, paramd.rf, paramd.rk, paramd.ri, paramd.rl, paramd.rg, paramd.rh, paramd.rj, paramd.rq, paramd.rr, paramd.rs, paramd.rm, paramd.rn, paramd.mPriority, paramd.rp, paramd.rx, paramd.rD, paramd.mExtras, paramd.rt, paramd.ru, paramd.rv);
      y.a(locala, paramd.rw);
      y.a(locala, paramd.ro);
      return locala.build();
    }
  }
  
  static final class k
    extends y.j
  {
    public final Bundle a(ab.b paramb)
    {
      Parcelable[] arrayOfParcelable = null;
      int i = 0;
      if (paramb == null) {
        return null;
      }
      Bundle localBundle1 = new Bundle();
      Object localObject = arrayOfParcelable;
      if (paramb.getParticipants() != null)
      {
        localObject = arrayOfParcelable;
        if (paramb.getParticipants().length > 1) {
          localObject = paramb.getParticipants()[0];
        }
      }
      arrayOfParcelable = new Parcelable[paramb.getMessages().length];
      while (i < arrayOfParcelable.length)
      {
        Bundle localBundle2 = new Bundle();
        localBundle2.putString("text", paramb.getMessages()[i]);
        localBundle2.putString("author", (String)localObject);
        arrayOfParcelable[i] = localBundle2;
        i += 1;
      }
      localBundle1.putParcelableArray("messages", arrayOfParcelable);
      localObject = paramb.bm();
      if (localObject != null) {
        localBundle1.putParcelable("remote_input", aa.a((ai.a)localObject));
      }
      localBundle1.putParcelable("on_reply", paramb.getReplyPendingIntent());
      localBundle1.putParcelable("on_read", paramb.getReadPendingIntent());
      localBundle1.putStringArray("participants", paramb.getParticipants());
      localBundle1.putLong("timestamp", paramb.getLatestTimestamp());
      return localBundle1;
    }
    
    public final Notification b(y.d paramd)
    {
      aa.a locala = new aa.a(paramd.mContext, paramd.rC, paramd.re, paramd.rf, paramd.rk, paramd.ri, paramd.rl, paramd.rg, paramd.rh, paramd.rj, paramd.rq, paramd.rr, paramd.rs, paramd.rm, paramd.rn, paramd.mPriority, paramd.rp, paramd.rx, paramd.ry, paramd.rD, paramd.mExtras, paramd.rz, paramd.rA, paramd.rB, paramd.rt, paramd.ru, paramd.rv);
      y.a(locala, paramd.rw);
      y.a(locala, paramd.ro);
      return locala.build();
    }
  }
  
  static class l
    implements y.i
  {
    public Bundle a(Notification paramNotification)
    {
      return null;
    }
    
    public Bundle a(ab.b paramb)
    {
      return null;
    }
    
    public Notification b(y.d paramd)
    {
      Notification localNotification = paramd.rC;
      localNotification.setLatestEventInfo(paramd.mContext, paramd.re, paramd.rf, paramd.rg);
      if (paramd.mPriority > 0) {
        localNotification.flags |= 0x80;
      }
      return localNotification;
    }
  }
  
  static final class m
    extends y.l
  {
    public final Notification b(y.d paramd)
    {
      Notification localNotification = paramd.rC;
      Context localContext = paramd.mContext;
      CharSequence localCharSequence1 = paramd.re;
      CharSequence localCharSequence2 = paramd.rf;
      PendingIntent localPendingIntent1 = paramd.rg;
      PendingIntent localPendingIntent2 = paramd.rh;
      localNotification.setLatestEventInfo(localContext, localCharSequence1, localCharSequence2, localPendingIntent1);
      localNotification.fullScreenIntent = localPendingIntent2;
      if (paramd.mPriority > 0) {
        localNotification.flags |= 0x80;
      }
      return localNotification;
    }
  }
  
  static final class n
    extends y.l
  {
    public final Notification b(y.d paramd)
    {
      Object localObject2 = paramd.mContext;
      Notification localNotification = paramd.rC;
      Object localObject1 = paramd.re;
      CharSequence localCharSequence1 = paramd.rf;
      CharSequence localCharSequence2 = paramd.rk;
      RemoteViews localRemoteViews = paramd.ri;
      int i = paramd.rl;
      PendingIntent localPendingIntent2 = paramd.rg;
      PendingIntent localPendingIntent1 = paramd.rh;
      paramd = paramd.rj;
      localObject2 = new Notification.Builder((Context)localObject2).setWhen(localNotification.when).setSmallIcon(localNotification.icon, localNotification.iconLevel).setContent(localNotification.contentView).setTicker(localNotification.tickerText, localRemoteViews).setSound(localNotification.sound, localNotification.audioStreamType).setVibrate(localNotification.vibrate).setLights(localNotification.ledARGB, localNotification.ledOnMS, localNotification.ledOffMS);
      if ((localNotification.flags & 0x2) != 0)
      {
        bool = true;
        localObject2 = ((Notification.Builder)localObject2).setOngoing(bool);
        if ((localNotification.flags & 0x8) == 0) {
          break label284;
        }
        bool = true;
        label180:
        localObject2 = ((Notification.Builder)localObject2).setOnlyAlertOnce(bool);
        if ((localNotification.flags & 0x10) == 0) {
          break label289;
        }
        bool = true;
        label201:
        localObject1 = ((Notification.Builder)localObject2).setAutoCancel(bool).setDefaults(localNotification.defaults).setContentTitle((CharSequence)localObject1).setContentText(localCharSequence1).setContentInfo(localCharSequence2).setContentIntent(localPendingIntent2).setDeleteIntent(localNotification.deleteIntent);
        if ((localNotification.flags & 0x80) == 0) {
          break label294;
        }
      }
      label284:
      label289:
      label294:
      for (boolean bool = true;; bool = false)
      {
        return ((Notification.Builder)localObject1).setFullScreenIntent(localPendingIntent1, bool).setLargeIcon(paramd).setNumber(i).getNotification();
        bool = false;
        break;
        bool = false;
        break label180;
        bool = false;
        break label201;
      }
    }
  }
  
  static final class o
    extends y.l
  {
    public final Notification b(y.d paramd)
    {
      return new ac.a(paramd.mContext, paramd.rC, paramd.re, paramd.rf, paramd.rk, paramd.ri, paramd.rl, paramd.rg, paramd.rh, paramd.rj, paramd.rq, paramd.rr, paramd.rs).build();
    }
  }
  
  static class p
    extends y.l
  {
    public Bundle a(Notification paramNotification)
    {
      return ad.a(paramNotification);
    }
    
    public Notification b(y.d paramd)
    {
      ad.a locala = new ad.a(paramd.mContext, paramd.rC, paramd.re, paramd.rf, paramd.rk, paramd.ri, paramd.rl, paramd.rg, paramd.rh, paramd.rj, paramd.rq, paramd.rr, paramd.rs, paramd.rn, paramd.mPriority, paramd.rp, paramd.rx, paramd.mExtras, paramd.rt, paramd.ru, paramd.rv);
      y.a(locala, paramd.rw);
      y.a(locala, paramd.ro);
      return locala.build();
    }
  }
  
  static class q
    extends y.p
  {
    public final Bundle a(Notification paramNotification)
    {
      return paramNotification.extras;
    }
    
    public Notification b(y.d paramd)
    {
      ae.a locala = new ae.a(paramd.mContext, paramd.rC, paramd.re, paramd.rf, paramd.rk, paramd.ri, paramd.rl, paramd.rg, paramd.rh, paramd.rj, paramd.rq, paramd.rr, paramd.rs, paramd.rm, paramd.rn, paramd.mPriority, paramd.rp, paramd.rx, paramd.rD, paramd.mExtras, paramd.rt, paramd.ru, paramd.rv);
      y.a(locala, paramd.rw);
      y.a(locala, paramd.ro);
      return locala.build();
    }
  }
  
  public static abstract class r
  {
    CharSequence rP;
    CharSequence rQ;
    boolean rR = false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\app\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */