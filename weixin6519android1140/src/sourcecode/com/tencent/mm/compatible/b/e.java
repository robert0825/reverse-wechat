package com.tencent.mm.compatible.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Message;
import com.jg.JgMethodChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.j;
import com.tencent.mm.compatible.d.k;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.compatible.util.l;
import com.tencent.mm.g.a.jg;
import com.tencent.mm.g.a.jg.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class e
{
  private static volatile e fMR;
  public static boolean fMU;
  public static boolean fMV;
  public static boolean fMW;
  private static boolean fMX;
  private static int fNd;
  private static int fNe;
  private static HashMap<Integer, String> fNf;
  private static int fNg;
  private static int fNh;
  private static HashMap<Integer, String> fNi;
  public final AudioManager fMS;
  private int fMT;
  private int fMY;
  private final Set<a> fMZ;
  private final int fNa;
  public ae fNb;
  private int fNc;
  
  static
  {
    GMTrace.i(13821473193984L, 102978);
    fMR = null;
    fMU = false;
    fMV = false;
    fMW = false;
    fMX = false;
    fNd = 0;
    fNe = 0;
    fNf = new HashMap();
    fNg = 0;
    fNh = 0;
    fNi = new HashMap();
    GMTrace.o(13821473193984L, 102978);
  }
  
  @JgMethodChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
  public e(Context paramContext)
  {
    GMTrace.i(13817178226688L, 102946);
    this.fMT = -1;
    this.fMY = 0;
    this.fMZ = new HashSet();
    this.fNa = 1000;
    this.fNb = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(16768760283136L, 124937);
        w.i("MicroMsg.MMAudioManager", "dkbt post delay BLUETOOTH_DEVICE_CONNECTED ");
        e.this.eg(3);
        GMTrace.o(16768760283136L, 124937);
      }
    };
    this.fNc = -1;
    this.fMS = ((AudioManager)paramContext.getSystemService("audio"));
    w.i("MicroMsg.MMAudioManager", "init dkbt %s", new Object[] { sl() });
    paramContext.registerReceiver(new BroadcastReceiver()new IntentFilter
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(13815030743040L, 102930);
        w.i("MicroMsg.MMAudioManager", "leonl onReceive action[ ACTION_AUDIO_BECOMING_NOISY ] ");
        e.this.eg(7);
        GMTrace.o(13815030743040L, 102930);
      }
    }, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    paramContext.registerReceiver(new BroadcastReceiver()new IntentFilter
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(13814762307584L, 102928);
        int i = paramAnonymousIntent.getIntExtra("state", -1);
        w.i("MicroMsg.MMAudioManager", "leonl onReceive action[ HEADSET_PLUG ] state = %s,mic = %s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramAnonymousIntent.getIntExtra("microphone", -1)) });
        if (i == 0)
        {
          e.this.eg(6);
          GMTrace.o(13814762307584L, 102928);
          return;
        }
        if (i == 1) {
          e.this.sg();
        }
        GMTrace.o(13814762307584L, 102928);
      }
    }, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    paramContext.registerReceiver(new BroadcastReceiver()new IntentFilter
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(13822949588992L, 102989);
        if (paramAnonymousIntent == null)
        {
          GMTrace.o(13822949588992L, 102989);
          return;
        }
        paramAnonymousContext = paramAnonymousIntent.getAction();
        e.fMW = paramAnonymousIntent.getBooleanExtra("existing", false);
        w.i("MicroMsg.MMAudioManager", "dkbt onReceive action[" + paramAnonymousContext + "] existing:" + e.fMW);
        GMTrace.o(13822949588992L, 102989);
      }
    }, new IntentFilter("com.htc.accessory.action.CONNECTION_EXISTING"));
    paramContext.registerReceiver(new BroadcastReceiver()new IntentFilter
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(13815836049408L, 102936);
        w.i("MicroMsg.MMAudioManager", "dkbt onReceive action[ BluetoothDevice.ACTION_ACL_CONNECTED ] ");
        if (f.eu(11))
        {
          e.fMU = true;
          e.this.fNb.sendEmptyMessageDelayed(0, 1000L);
        }
        GMTrace.o(13815836049408L, 102936);
      }
    }, new IntentFilter("android.bluetooth.device.action.ACL_CONNECTED"));
    paramContext.registerReceiver(new BroadcastReceiver()new IntentFilter
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(16768894500864L, 124938);
        w.i("MicroMsg.MMAudioManager", "dkbt onReceive action[ BluetoothDevice.ACTION_ACL_DISCONNECTED ] ");
        e.fMU = false;
        if (p.fQL.fPl == 1) {
          com.tencent.mm.compatible.c.a.a(e.this.fMS);
        }
        e.this.eg(4);
        GMTrace.o(16768894500864L, 124938);
      }
    }, new IntentFilter("android.bluetooth.device.action.ACL_DISCONNECTED"));
    if (f.et(11)) {
      paramContext.registerReceiver(new BroadcastReceiver()new IntentFilter
      {
        public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
        {
          GMTrace.i(16768357629952L, 124934);
          if (paramAnonymousIntent == null)
          {
            GMTrace.o(16768357629952L, 124934);
            return;
          }
          paramAnonymousContext = paramAnonymousIntent.getAction();
          int i = paramAnonymousIntent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
          w.i("MicroMsg.MMAudioManager", "dkbt onReceive action[" + paramAnonymousContext + "] state:" + i);
          if (i == 2)
          {
            e.fMU = true;
            e.this.fNb.sendEmptyMessageDelayed(0, 1000L);
            GMTrace.o(16768357629952L, 124934);
            return;
          }
          if (i == 0)
          {
            e.fMU = false;
            if (p.fQL.fPl == 1) {
              com.tencent.mm.compatible.c.a.a(e.this.fMS);
            }
            e.this.eg(4);
          }
          GMTrace.o(16768357629952L, 124934);
        }
      }, new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"));
    }
    GMTrace.o(13817178226688L, 102946);
  }
  
  public static void ej(int paramInt)
  {
    GMTrace.i(18797192806400L, 140050);
    fNd += 1;
    w.e("MicroMsg.MMAudioManager", "mm audio track init [%d] mmInitCount[%d] mmReleaseCount[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(fNd), Integer.valueOf(fNe) });
    fNf.put(Integer.valueOf(paramInt), new ah().toString());
    su();
    GMTrace.o(18797192806400L, 140050);
  }
  
  public static void ek(int paramInt)
  {
    GMTrace.i(18797327024128L, 140051);
    fNe += 1;
    w.e("MicroMsg.MMAudioManager", "mm audio track release [%d] mmInitCount[%d] mmReleaseCount[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(fNd), Integer.valueOf(fNe) });
    fNf.remove(Integer.valueOf(paramInt));
    GMTrace.o(18797327024128L, 140051);
  }
  
  public static void el(int paramInt)
  {
    GMTrace.i(18797461241856L, 140052);
    fNg += 1;
    w.e("MicroMsg.MMAudioManager", "mm media player init [%d] mmMpInitCount[%d] mmMpReleaseCount[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(fNg), Integer.valueOf(fNh) });
    fNi.put(Integer.valueOf(paramInt), new ah().toString());
    su();
    GMTrace.o(18797461241856L, 140052);
  }
  
  public static void em(int paramInt)
  {
    GMTrace.i(18797595459584L, 140053);
    fNh += 1;
    w.e("MicroMsg.MMAudioManager", "mm media player release [%d] mmMpInitCount[%d] mmMpReleaseCount[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(fNg), Integer.valueOf(fNh) });
    fNi.remove(Integer.valueOf(paramInt));
    GMTrace.o(18797595459584L, 140053);
  }
  
  public static e sd()
  {
    GMTrace.i(14614968401920L, 108890);
    if (fMR == null) {}
    try
    {
      if (fMR == null) {
        fMR = new e(ab.getContext());
      }
      e locale = fMR;
      GMTrace.o(14614968401920L, 108890);
      return locale;
    }
    finally {}
  }
  
  @TargetApi(14)
  private static boolean si()
  {
    GMTrace.i(13817849315328L, 102951);
    try
    {
      if (Build.VERSION.SDK_INT >= 14)
      {
        int i = BluetoothAdapter.getDefaultAdapter().getProfileConnectionState(1);
        w.i("MicroMsg.MMAudioManager", "isConnectHeadset getProfileConnectionState: %s", new Object[] { Integer.valueOf(i) });
        if (i == 2)
        {
          GMTrace.o(13817849315328L, 102951);
          return true;
        }
        GMTrace.o(13817849315328L, 102951);
        return false;
      }
      boolean bool = fMU;
      if (bool)
      {
        GMTrace.o(13817849315328L, 102951);
        return true;
      }
      if (p.fQL.fPw == 1)
      {
        bool = BluetoothAdapter.getDefaultAdapter().isEnabled();
        GMTrace.o(13817849315328L, 102951);
        return bool;
      }
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MMAudioManager", "dkbt exception in isConnectDevice()");
      GMTrace.o(13817849315328L, 102951);
    }
    return false;
  }
  
  public static int sj()
  {
    GMTrace.i(13818117750784L, 102953);
    ((AudioManager)ab.getContext().getSystemService("audio")).isBluetoothScoOn();
    GMTrace.o(13818117750784L, 102953);
    return 0;
  }
  
  public static boolean sk()
  {
    GMTrace.i(13818251968512L, 102954);
    w.d("MicroMsg.MMAudioManager", "dkbt isBluetoothCanUse existing:" + fMW + " , isUseHTCAccessory = " + fMX);
    if ((fMW) && (!fMX))
    {
      GMTrace.o(13818251968512L, 102954);
      return false;
    }
    w.d("MicroMsg.MMAudioManager", "dkbt isACLConnected:" + fMU);
    if (!si())
    {
      w.i("MicroMsg.MMAudioManager", "dkbt isACLConnected =  " + fMU + " , isConnectHeadset() = " + si());
      GMTrace.o(13818251968512L, 102954);
      return false;
    }
    Object localObject = BluetoothAdapter.getDefaultAdapter();
    if (localObject == null)
    {
      w.d("MicroMsg.MMAudioManager", "dkbt BluetoothAdapter.getDefaultAdapter() == null");
      GMTrace.o(13818251968512L, 102954);
      return false;
    }
    if (!((BluetoothAdapter)localObject).isEnabled())
    {
      w.i("MicroMsg.MMAudioManager", "dkbt !adp.isEnabled()");
      GMTrace.o(13818251968512L, 102954);
      return false;
    }
    localObject = ((BluetoothAdapter)localObject).getBondedDevices();
    if ((localObject == null) || (((Set)localObject).size() == 0))
    {
      w.e("MicroMsg.MMAudioManager", "dkbt setDev == null || setDev.size() == 0");
      GMTrace.o(13818251968512L, 102954);
      return false;
    }
    localObject = ((Set)localObject).iterator();
    do
    {
      if (!((Iterator)localObject).hasNext()) {
        break;
      }
    } while (((BluetoothDevice)((Iterator)localObject).next()).getBondState() != 12);
    for (int i = 1;; i = 0)
    {
      if (i == 0)
      {
        w.i("MicroMsg.MMAudioManager", "dkbt hasBond == false");
        GMTrace.o(13818251968512L, 102954);
        return false;
      }
      w.i("MicroMsg.MMAudioManager", "alvinluo isBluetoothCanUse: %b", new Object[] { Boolean.valueOf(true) });
      GMTrace.o(13818251968512L, 102954);
      return true;
    }
  }
  
  private void sq()
  {
    GMTrace.i(13819728363520L, 102965);
    if (this.fMS != null)
    {
      int i = this.fMS.getMode();
      boolean bool = this.fMS.isSpeakerphoneOn();
      Object localObject1 = k.sI().eo(98305);
      Object localObject2 = k.sI().eo(94209);
      if (localObject1 == null)
      {
        k.sI().set(98305, Boolean.valueOf(bool));
        w.d("MicroMsg.MMAudioManager", "storeAudioConfig spearkeron " + bool);
      }
      if (localObject2 == null)
      {
        k.sI().set(94209, Integer.valueOf(i));
        w.d("MicroMsg.MMAudioManager", "storeAudioConfig inmode " + i);
      }
    }
    GMTrace.o(13819728363520L, 102965);
  }
  
  private static void su()
  {
    GMTrace.i(18797729677312L, 140054);
    jg localjg = new jg();
    if (fNd - fNe > 1)
    {
      localjg.eMQ.eMR = true;
      localjg.eMQ.eMS = fNf.size();
    }
    if (fNg - fNh > 1)
    {
      localjg.eMQ.eMT = true;
      localjg.eMQ.eMU = fNi.size();
    }
    if ((localjg.eMQ.eMT) || (localjg.eMQ.eMR))
    {
      w.e("MicroMsg.MMAudioManager", "check media leak audio[%b %d] mediaplayer[%b %d]", new Object[] { Boolean.valueOf(localjg.eMQ.eMR), Integer.valueOf(localjg.eMQ.eMS), Boolean.valueOf(localjg.eMQ.eMT), Integer.valueOf(localjg.eMQ.eMU) });
      com.tencent.mm.sdk.b.a.vgX.m(localjg);
    }
    GMTrace.o(18797729677312L, 140054);
  }
  
  public static String sv()
  {
    GMTrace.i(18797863895040L, 140055);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("AudioTrack: \r\n");
    ((StringBuffer)localObject).append("leak: ").append(fNf.size()).append("init: ").append(fNd).append("release: ").append(fNe).append("\r\n");
    ((StringBuffer)localObject).append("--------leak map-----------\r\n");
    Iterator localIterator;
    if (!fNf.isEmpty())
    {
      localIterator = fNf.values().iterator();
      while (localIterator.hasNext()) {
        ((StringBuffer)localObject).append((String)localIterator.next()).append("\r\n");
      }
    }
    ((StringBuffer)localObject).append("MediaPlayer: \r\n");
    ((StringBuffer)localObject).append("leak: ").append(fNi.size()).append("init: ").append(fNg).append("release: ").append(fNh).append("\r\n");
    ((StringBuffer)localObject).append("--------leak map-----------\r\n");
    if (!fNi.isEmpty())
    {
      localIterator = fNi.values().iterator();
      while (localIterator.hasNext()) {
        ((StringBuffer)localObject).append((String)localIterator.next()).append("\r\n");
      }
    }
    localObject = ((StringBuffer)localObject).toString();
    w.e("MicroMsg.MMAudioManager", "leak? %s", new Object[] { localObject });
    GMTrace.o(18797863895040L, 140055);
    return (String)localObject;
  }
  
  public final void a(a parama)
  {
    GMTrace.i(13816775573504L, 102943);
    if (parama != null) {
      this.fMZ.add(parama);
    }
    GMTrace.o(13816775573504L, 102943);
  }
  
  public final boolean a(boolean paramBoolean, int paramInt)
  {
    GMTrace.i(13818923057152L, 102959);
    int i = this.fMS.getStreamMaxVolume(paramInt);
    w.d("MicroMsg.MMAudioManager", "maxVolumn:" + i);
    i /= 3;
    int j = this.fMS.getStreamVolume(paramInt);
    if (j < i) {
      this.fMS.setStreamVolume(paramInt, i, 0);
    }
    w.i("MicroMsg.MMAudioManager", "StreamType:" + paramInt + "  current:" + j);
    paramBoolean = e(paramBoolean, true);
    GMTrace.o(13818923057152L, 102959);
    return paramBoolean;
  }
  
  public final int aK(boolean paramBoolean)
  {
    int j = 0;
    GMTrace.i(13817983533056L, 102952);
    int i;
    if (paramBoolean)
    {
      i = 3;
      if (!sh()) {
        break label42;
      }
      i = j;
    }
    label42:
    for (;;)
    {
      GMTrace.o(13817983533056L, 102952);
      return i;
      i = 0;
      break;
    }
  }
  
  @TargetApi(11)
  public final boolean aL(boolean paramBoolean)
  {
    int i = 2;
    int k = 0;
    int j = 0;
    GMTrace.i(13818788839424L, 102958);
    w.d("MicroMsg.MMAudioManager", "IPCall dkbt shiftSpeaker:%b -> %b  %s", new Object[] { Boolean.valueOf(sm()), Boolean.valueOf(paramBoolean), sl() });
    if (ap.qk())
    {
      w.v("MicroMsg.MMAudioManager", "shiftSpeaker return when calling blue:%d", new Object[] { Integer.valueOf(this.fMT) });
      GMTrace.o(13818788839424L, 102958);
      return false;
    }
    if (fMV)
    {
      setMode(3);
      GMTrace.o(13818788839424L, 102958);
      return false;
    }
    sq();
    if (p.fQD.fOn)
    {
      if (paramBoolean)
      {
        if (Build.VERSION.SDK_INT < 11) {}
        for (i = j;; i = 3)
        {
          if (p.fQD.fOo >= 0) {
            i = p.fQD.fOo;
          }
          w.d("MicroMsg.MMAudioManager", "IPCall doShiftSpeaker useSpeakerMode:" + i);
          if (i != this.fMS.getMode()) {
            setMode(i);
          }
          if (!this.fMS.isSpeakerphoneOn()) {
            setSpeakerphoneOn(true);
          }
          GMTrace.o(13818788839424L, 102958);
          return paramBoolean;
        }
      }
      if (Build.VERSION.SDK_INT < 11) {
        if (p.fQL.fPw == 1) {
          w.d("MicroMsg.MMAudioManager", "doShiftSpeaker htc usePhoneMode : 0");
        }
      }
      for (i = 0;; i = 3)
      {
        if (p.fQD.fOp >= 0) {
          i = p.fQD.fOp;
        }
        w.d("MicroMsg.MMAudioManager", "IPCall doShiftSpeaker usePhoneMode:" + i);
        if (i != this.fMS.getMode()) {
          setMode(i);
        }
        if (!this.fMS.isSpeakerphoneOn()) {
          break;
        }
        setSpeakerphoneOn(false);
        break;
      }
    }
    if (p.fQD.fNp)
    {
      if (p.fQD.sw())
      {
        if (p.fQD.fNr >= 0) {
          setMode(p.fQD.fNr);
        }
        for (;;)
        {
          if (p.fQD.fNt > 0) {
            setSpeakerphoneOn(paramBoolean);
          }
          GMTrace.o(13818788839424L, 102958);
          return paramBoolean;
          if (p.fQD.fNs >= 0) {
            if (paramBoolean) {
              setMode(0);
            } else {
              setMode(2);
            }
          }
        }
      }
      if (p.fQD.sx())
      {
        if (paramBoolean)
        {
          if (p.fQD.sA()) {
            setSpeakerphoneOn(true);
          }
          if (p.fQD.sz() >= 0) {
            setMode(p.fQD.sz());
          }
        }
        for (;;)
        {
          GMTrace.o(13818788839424L, 102958);
          return paramBoolean;
          if (p.fQD.sC()) {
            setSpeakerphoneOn(false);
          }
          if (p.fQD.sB() >= 0) {
            setMode(p.fQD.sB());
          }
        }
      }
    }
    if (paramBoolean)
    {
      if (Build.VERSION.SDK_INT < 11) {}
      for (i = k;; i = 3)
      {
        if (p.fQD.fNO >= 0) {
          i = p.fQD.fNO;
        }
        w.d("MicroMsg.MMAudioManager", "IPCall doShiftSpeaker useSpeakerMode:" + i);
        if (i != this.fMS.getMode()) {
          setMode(i);
        }
        if (!this.fMS.isSpeakerphoneOn()) {
          setSpeakerphoneOn(true);
        }
        GMTrace.o(13818788839424L, 102958);
        return paramBoolean;
      }
    }
    if (Build.VERSION.SDK_INT < 11)
    {
      if (p.fQL.fPw != 1) {
        break label771;
      }
      w.d("MicroMsg.MMAudioManager", "doShiftSpeaker htc usePhoneMode : 0");
      i = 0;
    }
    for (;;)
    {
      j = i;
      if (Build.VERSION.SDK_INT >= 11)
      {
        j = i;
        if (l.rG())
        {
          j = i;
          if (2 == p.fQL.fPx) {
            j = 2;
          }
        }
      }
      if (p.fQD.fNP >= 0) {
        j = p.fQD.fNP;
      }
      w.d("MicroMsg.MMAudioManager", "IPCall doShiftSpeaker usePhoneMode:" + j);
      if (j != this.fMS.getMode()) {
        setMode(j);
      }
      if (!this.fMS.isSpeakerphoneOn()) {
        break;
      }
      setSpeakerphoneOn(false);
      break;
      i = 3;
      continue;
      label771:
      i = 2;
    }
  }
  
  public final void az(int paramInt1, int paramInt2)
  {
    GMTrace.i(20315329527808L, 151361);
    if (this.fMS != null)
    {
      w.i("MicroMsg.MMAudioManager", "setStreamVolume streamType:%s,index:%s,flags:%s ", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(0) });
      this.fMS.setStreamVolume(paramInt1, paramInt2, 0);
    }
    GMTrace.o(20315329527808L, 151361);
  }
  
  public final void b(a parama)
  {
    GMTrace.i(13816909791232L, 102944);
    if (parama != null) {
      this.fMZ.remove(parama);
    }
    GMTrace.o(13816909791232L, 102944);
  }
  
  @TargetApi(11)
  public final boolean e(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 1;
    int k = 0;
    int j = 0;
    GMTrace.i(13818654621696L, 102957);
    int m = this.fMS.getMode();
    w.i("MicroMsg.MMAudioManager", "dkbt shiftSpeaker:%b -> %b  %s", new Object[] { Boolean.valueOf(sm()), Boolean.valueOf(paramBoolean1), sl() });
    if (ap.qk())
    {
      w.v("MicroMsg.MMAudioManager", "shiftSpeaker return when calling Mode:%d blue:%d", new Object[] { Integer.valueOf(m), Integer.valueOf(this.fMT) });
      GMTrace.o(13818654621696L, 102957);
      return false;
    }
    if ((sh()) || (fMV))
    {
      w.i("MicroMsg.MMAudioManager", "dkbt shiftSpeaker isBluetoothOn");
      if (!paramBoolean2) {
        setMode(0);
      }
      for (;;)
      {
        GMTrace.o(13818654621696L, 102957);
        return false;
        w.d("MicroMsg.MMAudioManager", "Bluetooth is on and now is in VoIP , set 3 MODE_IN_COMMUNICATION..");
        setMode(3);
      }
    }
    sq();
    if (paramBoolean2)
    {
      if (p.fQD.fNp)
      {
        if (p.fQD.sw())
        {
          if (p.fQD.fNr >= 0) {
            setMode(p.fQD.fNr);
          }
          for (;;)
          {
            if (p.fQD.fNt > 0) {
              setSpeakerphoneOn(paramBoolean1);
            }
            GMTrace.o(13818654621696L, 102957);
            return paramBoolean1;
            if (p.fQD.fNs >= 0) {
              if (paramBoolean1) {
                setMode(0);
              } else {
                setMode(2);
              }
            }
          }
        }
        if (p.fQD.sx())
        {
          if (paramBoolean1)
          {
            if (p.fQD.sA()) {
              setSpeakerphoneOn(true);
            }
            if (p.fQD.sz() >= 0) {
              setMode(p.fQD.sz());
            }
          }
          for (;;)
          {
            GMTrace.o(13818654621696L, 102957);
            return paramBoolean1;
            if (p.fQD.sC()) {
              setSpeakerphoneOn(false);
            }
            if (p.fQD.sB() >= 0) {
              setMode(p.fQD.sB());
            }
          }
        }
      }
    }
    else if ((p.fQD.fNp) && (p.fQD.sy()))
    {
      if (paramBoolean1)
      {
        localObject = p.fQD;
        i = j;
        if (((com.tencent.mm.compatible.d.a)localObject).sy())
        {
          k = ((com.tencent.mm.compatible.d.a)localObject).fNv & 0x10;
          localObject = new StringBuilder("enableSpeaker ");
          if (k <= 0) {
            break label489;
          }
        }
        label489:
        for (paramBoolean2 = true;; paramBoolean2 = false)
        {
          w.d("VoipAudioInfo", paramBoolean2);
          i = j;
          if (k > 0) {
            i = 1;
          }
          if (i != 0) {
            setSpeakerphoneOn(true);
          }
          if (p.fQD.sD() >= 0) {
            setMode(p.fQD.sD());
          }
          GMTrace.o(13818654621696L, 102957);
          return paramBoolean1;
        }
      }
      Object localObject = p.fQD;
      if (((com.tencent.mm.compatible.d.a)localObject).sy())
      {
        j = ((com.tencent.mm.compatible.d.a)localObject).fNv & 0x1;
        localObject = new StringBuilder("disableSpeaker ");
        if (j > 0)
        {
          paramBoolean2 = true;
          label535:
          w.d("VoipAudioInfo", paramBoolean2);
          if (j <= 0) {
            break label591;
          }
        }
      }
      for (;;)
      {
        if (i != 0) {
          setSpeakerphoneOn(false);
        }
        if (p.fQD.sE() < 0) {
          break;
        }
        setMode(p.fQD.sE());
        break;
        paramBoolean2 = false;
        break label535;
        label591:
        i = 0;
        continue;
        i = 0;
      }
    }
    if (paramBoolean2)
    {
      if (paramBoolean1)
      {
        if (Build.VERSION.SDK_INT < 11)
        {
          i = k;
          if (p.fQD.fNO >= 0) {
            i = p.fQD.fNO;
          }
          w.d("MicroMsg.MMAudioManager", "voip doShiftSpeaker useSpeakerMode:" + i);
          if (i != this.fMS.getMode()) {
            setMode(i);
          }
          if (i != this.fMS.getMode())
          {
            if (this.fMY != 0) {
              break label728;
            }
            this.fMY = 1;
          }
        }
        for (;;)
        {
          if (!this.fMS.isSpeakerphoneOn()) {
            setSpeakerphoneOn(true);
          }
          GMTrace.o(13818654621696L, 102957);
          return paramBoolean1;
          i = 3;
          break;
          label728:
          if (this.fMY == 2) {
            this.fMY = 3;
          }
        }
      }
      if (Build.VERSION.SDK_INT < 11)
      {
        if (p.fQL.fPw != 1) {
          break label1020;
        }
        w.d("MicroMsg.MMAudioManager", "doShiftSpeaker htc usePhoneMode : 0");
        i = 0;
      }
    }
    for (;;)
    {
      label782:
      j = i;
      if (Build.VERSION.SDK_INT >= 11)
      {
        j = i;
        if (l.rG())
        {
          j = i;
          if (2 == p.fQL.fPx) {
            j = 2;
          }
        }
      }
      if (p.fQD.fNP >= 0) {
        j = p.fQD.fNP;
      }
      w.d("MicroMsg.MMAudioManager", "voip doShiftSpeaker usePhoneMode:" + j);
      if (j != this.fMS.getMode()) {
        setMode(j);
      }
      if (j != this.fMS.getMode())
      {
        if (this.fMY != 0) {
          break label923;
        }
        this.fMY = 2;
      }
      for (;;)
      {
        if (!this.fMS.isSpeakerphoneOn()) {
          break label937;
        }
        setSpeakerphoneOn(false);
        break;
        i = 3;
        break label782;
        label923:
        if (this.fMY == 1) {
          this.fMY = 3;
        }
      }
      label937:
      break;
      setSpeakerphoneOn(paramBoolean1);
      if (sm() == paramBoolean1) {
        break;
      }
      if (paramBoolean1)
      {
        setMode(0);
        break;
      }
      if ((Build.VERSION.SDK_INT >= 11) && (l.rG()) && (2 != p.fQL.fPx))
      {
        setMode(3);
        break;
      }
      if (Build.VERSION.SDK_INT >= 11)
      {
        setMode(3);
        break;
      }
      setMode(2);
      break;
      label1020:
      i = 2;
    }
  }
  
  public final void eg(int paramInt)
  {
    GMTrace.i(13817044008960L, 102945);
    w.i("MicroMsg.MMAudioManager", "notify, new status: %d, current status: %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.fMT) });
    Iterator localIterator = this.fMZ.iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).dc(paramInt);
    }
    GMTrace.o(13817044008960L, 102945);
  }
  
  public final void eh(int paramInt)
  {
    GMTrace.i(13819191492608L, 102961);
    if (this.fMS != null) {
      this.fMS.adjustStreamVolume(paramInt, 1, 5);
    }
    GMTrace.o(13819191492608L, 102961);
  }
  
  public final void ei(int paramInt)
  {
    GMTrace.i(13819325710336L, 102962);
    if (this.fMS != null) {
      this.fMS.adjustStreamVolume(paramInt, -1, 5);
    }
    GMTrace.o(13819325710336L, 102962);
  }
  
  public final int getStreamMaxVolume(int paramInt)
  {
    GMTrace.i(13820399452160L, 102970);
    if (this.fMS != null)
    {
      paramInt = this.fMS.getStreamMaxVolume(paramInt);
      GMTrace.o(13820399452160L, 102970);
      return paramInt;
    }
    GMTrace.o(13820399452160L, 102970);
    return 5;
  }
  
  public final int getStreamVolume(int paramInt)
  {
    GMTrace.i(13820533669888L, 102971);
    if (this.fMS != null)
    {
      paramInt = this.fMS.getStreamVolume(paramInt);
      GMTrace.o(13820533669888L, 102971);
      return paramInt;
    }
    GMTrace.o(13820533669888L, 102971);
    return -1;
  }
  
  public final void se()
  {
    GMTrace.i(13817312444416L, 102947);
    w.i("MicroMsg.MMAudioManager", "dkbt bluetoothStopped %s", new Object[] { sl() });
    fMV = false;
    eg(2);
    GMTrace.o(13817312444416L, 102947);
  }
  
  public final void setMode(int paramInt)
  {
    GMTrace.i(13819996798976L, 102967);
    if (this.fMS != null)
    {
      w.i("MicroMsg.MMAudioManager", "set mode from %d to %d", new Object[] { Integer.valueOf(this.fMS.getMode()), Integer.valueOf(paramInt) });
      this.fMS.setMode(paramInt);
    }
    GMTrace.o(13819996798976L, 102967);
  }
  
  public final void setSpeakerphoneOn(boolean paramBoolean)
  {
    GMTrace.i(13820131016704L, 102968);
    w.k("MicroMsg.MMAudioManager", "setSpeakerphoneOn, on: " + paramBoolean, new Object[0]);
    if (this.fMS != null)
    {
      w.i("MicroMsg.MMAudioManager", "setSpeakerphoneOn on: " + paramBoolean);
      this.fMS.setSpeakerphoneOn(paramBoolean);
    }
    GMTrace.o(13820131016704L, 102968);
  }
  
  public final int sf()
  {
    GMTrace.i(13817446662144L, 102948);
    this.fMT = -1;
    if (!sk())
    {
      GMTrace.o(13817446662144L, 102948);
      return -1;
    }
    w.k("MicroMsg.MMAudioManager", "dkbt begin tryStartBluetooth %s", new Object[] { sl() });
    AudioManager localAudioManager = this.fMS;
    boolean bool;
    if (!localAudioManager.isBluetoothScoAvailableOffCall()) {
      bool = false;
    }
    for (;;)
    {
      w.i("MicroMsg.MMAudioManager", "dkbt end tryStartBluetooth %s ret:%s", new Object[] { sl(), Boolean.valueOf(bool) });
      w.d("MicroMsg.MMAudioManager", "dkbt  tryStartBluetooth " + sl() + " ret:" + bool);
      bool = sh();
      w.i("MicroMsg.MMAudioManager", "alvinluo isBluetoothOn: %b", new Object[] { Boolean.valueOf(bool) });
      if (!bool) {
        break;
      }
      GMTrace.o(13817446662144L, 102948);
      return 1;
      if (ap.qk())
      {
        bool = false;
      }
      else
      {
        w.i("MicroMsg.BluetoothUtil", "start DeviceInfo mCommonInfo getStartBluetoothSco:%s ", new Object[] { Integer.valueOf(p.fQL.fPn) });
        if (((p.fQL.fPn == 1) || (p.fQL.fPn == -1)) && (!localAudioManager.isBluetoothScoOn()))
        {
          w.i("MicroMsg.BluetoothUtil", "BluetoothUtil am.isBluetoothScoOn is false and startBluetoothSco, stack: %s", new Object[] { bg.bQW() });
          localAudioManager.startBluetoothSco();
        }
        bool = true;
      }
    }
    GMTrace.o(13817446662144L, 102948);
    return 0;
  }
  
  public final void sg()
  {
    GMTrace.i(13817580879872L, 102949);
    fMV = false;
    w.k("MicroMsg.MMAudioManager", "dkbt begin stopBluetooth %s", new Object[] { sl() });
    com.tencent.mm.compatible.c.a.a(this.fMS);
    this.fNb.removeCallbacksAndMessages(Integer.valueOf(1));
    w.i("MicroMsg.MMAudioManager", "dkbt end stopBluetooth %s", new Object[] { sl() });
    GMTrace.o(13817580879872L, 102949);
  }
  
  public final boolean sh()
  {
    GMTrace.i(13817715097600L, 102950);
    if ((this.fMS.isBluetoothScoOn()) || (this.fMS.isBluetoothA2dpOn()) || (fMV))
    {
      GMTrace.o(13817715097600L, 102950);
      return true;
    }
    GMTrace.o(13817715097600L, 102950);
    return false;
  }
  
  public final String sl()
  {
    GMTrace.i(13818386186240L, 102955);
    if (this.fMS != null) {}
    for (int i = this.fMS.getMode();; i = 0)
    {
      String str = "mode:" + i + " isSpeakerphoneOn:" + this.fMS.isSpeakerphoneOn() + " isBluetoothOn:" + sh() + " btStatus:" + this.fMT;
      GMTrace.o(13818386186240L, 102955);
      return str;
    }
  }
  
  public final boolean sm()
  {
    GMTrace.i(13818520403968L, 102956);
    if (this.fMS.getMode() == 0)
    {
      GMTrace.o(13818520403968L, 102956);
      return true;
    }
    GMTrace.o(13818520403968L, 102956);
    return false;
  }
  
  public final boolean sn()
  {
    GMTrace.i(13819057274880L, 102960);
    if (this.fMS != null)
    {
      boolean bool = this.fMS.isWiredHeadsetOn();
      GMTrace.o(13819057274880L, 102960);
      return bool;
    }
    GMTrace.o(13819057274880L, 102960);
    return false;
  }
  
  public final void so()
  {
    GMTrace.i(13819459928064L, 102963);
    if (this.fMS != null) {
      this.fMS.setStreamMute(3, true);
    }
    GMTrace.o(13819459928064L, 102963);
  }
  
  public final void sp()
  {
    GMTrace.i(13819594145792L, 102964);
    if (this.fMS != null) {
      this.fMS.setStreamMute(3, false);
    }
    GMTrace.o(13819594145792L, 102964);
  }
  
  @Deprecated
  public final void sr()
  {
    GMTrace.i(13819862581248L, 102966);
    Object localObject2;
    if (this.fMS != null)
    {
      Object localObject1 = k.sI().eo(98305);
      localObject2 = k.sI().eo(94209);
      if (localObject1 != null)
      {
        w.d("MicroMsg.MMAudioManager", "resumeAudioConfig spearkeron: " + localObject1);
        setSpeakerphoneOn(((Boolean)localObject1).booleanValue());
        k.sI().set(98305, null);
      }
      if (localObject2 == null) {}
    }
    try
    {
      w.i("MicroMsg.MMAudioManager", "resumeAudioConfig oinmode: " + localObject2 + ",inmode:0");
      i = bg.getInt(String.valueOf(localObject2), 0);
      if ((i >= -1) && (i < 4))
      {
        setMode(i);
        k.sI().set(94209, null);
        GMTrace.o(13819862581248L, 102966);
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        int i = 0;
        continue;
        setMode(0);
      }
    }
  }
  
  public final int ss()
  {
    GMTrace.i(13820265234432L, 102969);
    int i = this.fMY;
    this.fMY = 0;
    GMTrace.o(13820265234432L, 102969);
    return i;
  }
  
  public final int st()
  {
    GMTrace.i(13820667887616L, 102972);
    if (this.fNc == -1) {}
    try
    {
      Field localField = Class.forName("android.media.AudioManager").getField("STREAM_BLUETOOTH_SCO");
      if ((localField != null) && (this.fMS != null)) {
        this.fNc = localField.getInt(this.fMS);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        int i;
        w.e("MicroMsg.MMAudioManager", "ClassNotFoundException  android.media.AudioManager,exception:" + localException.getMessage());
        this.fNc = 6;
      }
    }
    i = this.fNc;
    GMTrace.o(13820667887616L, 102972);
    return i;
  }
  
  public static abstract interface a
  {
    public abstract void dc(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */