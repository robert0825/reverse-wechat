package com.tencent.mm.booter.notification.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import java.nio.charset.Charset;

public final class f
{
  Context context;
  public boolean fLj;
  public MediaPlayer fLk;
  @SuppressLint({"HandlerLeak"})
  ae fLl;
  private ae fLm;
  
  public f()
  {
    GMTrace.i(527878324224L, 3933);
    this.fLj = false;
    this.fLk = null;
    this.fLl = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(532710162432L, 3969);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Notification.Tool.Sound", "play sound handler, try to stop notify mediaplayer playerIsInit:%s", new Object[] { Boolean.valueOf(f.this.fLj) });
        try
        {
          if (f.this.fLk != null)
          {
            if (f.this.fLk.isPlaying()) {
              f.this.fLk.stop();
            }
            f.this.fLk.release();
            f.this.fLj = false;
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Notification.Tool.Sound", "play sound handler, try to stop notify mediaplayer done playerIsInit:%s", new Object[] { Boolean.valueOf(f.this.fLj) });
          }
          GMTrace.o(532710162432L, 3969);
          return;
        }
        catch (IllegalStateException paramAnonymousMessage)
        {
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.Notification.Tool.Sound", "Exception in playSoundHander,playerIsInit:%s", new Object[] { Boolean.valueOf(f.this.fLj) });
          if (f.this.fLk != null) {
            f.this.fLk.release();
          }
          GMTrace.o(532710162432L, 3969);
        }
      }
    };
    this.context = ab.getContext();
    Object localObject1 = com.tencent.mm.storage.w.ghv + "deviceconfig.cfg";
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ServerConfigInfoStorage", "readConfigFromLocalFile, path: %s, isExist: %s", new Object[] { localObject1, Boolean.valueOf(com.tencent.mm.a.e.aZ((String)localObject1)) });
    if (!com.tencent.mm.a.e.aZ((String)localObject1)) {
      localObject1 = localObject2;
    }
    for (;;)
    {
      p.dO((String)localObject1);
      GMTrace.o(527878324224L, 3933);
      return;
      Object localObject3 = com.tencent.mm.a.e.d((String)localObject1, 0, -1);
      localObject1 = localObject2;
      if (!bg.bq((byte[])localObject3))
      {
        localObject3 = new String((byte[])localObject3, Charset.defaultCharset());
        localObject1 = localObject2;
        if (!bg.nm((String)localObject3)) {
          localObject1 = localObject3;
        }
      }
    }
  }
  
  public final void dC(final String paramString)
  {
    try
    {
      GMTrace.i(17446559809536L, 129987);
      if (this.fLm == null)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Notification.Tool.Sound", "playSound playHandler == null");
        HandlerThread localHandlerThread = com.tencent.mm.sdk.f.e.cK("playSoundThread", 0);
        localHandlerThread.start();
        this.fLm = new ae(localHandlerThread.getLooper());
      }
      this.fLm.post(new Runnable()
      {
        /* Error */
        public final void run()
        {
          // Byte code:
          //   0: ldc2_w 49
          //   3: ldc 51
          //   5: invokestatic 37	com/tencent/gmtrace/GMTrace:i	(JI)V
          //   8: aload_0
          //   9: getfield 21	com/tencent/mm/booter/notification/a/f$2:fLn	Lcom/tencent/mm/booter/notification/a/f;
          //   12: astore 14
          //   14: aload_0
          //   15: getfield 23	com/tencent/mm/booter/notification/a/f$2:fLo	Ljava/lang/String;
          //   18: astore 15
          //   20: aload_0
          //   21: getfield 25	com/tencent/mm/booter/notification/a/f$2:fLp	Z
          //   24: istore 8
          //   26: aload 14
          //   28: getfield 55	com/tencent/mm/booter/notification/a/f:context	Landroid/content/Context;
          //   31: ifnonnull +11 -> 42
          //   34: aload 14
          //   36: invokestatic 61	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
          //   39: putfield 55	com/tencent/mm/booter/notification/a/f:context	Landroid/content/Context;
          //   42: aload 14
          //   44: getfield 55	com/tencent/mm/booter/notification/a/f:context	Landroid/content/Context;
          //   47: ifnonnull +19 -> 66
          //   50: ldc 63
          //   52: ldc 65
          //   54: invokestatic 71	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
          //   57: ldc2_w 49
          //   60: ldc 51
          //   62: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
          //   65: return
          //   66: aload 14
          //   68: getfield 55	com/tencent/mm/booter/notification/a/f:context	Landroid/content/Context;
          //   71: ldc 73
          //   73: invokevirtual 79	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
          //   76: checkcast 81	android/media/AudioManager
          //   79: astore 16
          //   81: aload 16
          //   83: iconst_5
          //   84: invokevirtual 85	android/media/AudioManager:getStreamVolume	(I)I
          //   87: istore 7
          //   89: iload 7
          //   91: ifne +12 -> 103
          //   94: ldc2_w 49
          //   97: ldc 51
          //   99: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
          //   102: return
          //   103: aload 14
          //   105: getfield 89	com/tencent/mm/booter/notification/a/f:fLl	Lcom/tencent/mm/sdk/platformtools/ae;
          //   108: ldc 90
          //   110: invokevirtual 96	com/tencent/mm/sdk/platformtools/ae:removeMessages	(I)V
          //   113: aload 14
          //   115: getfield 89	com/tencent/mm/booter/notification/a/f:fLl	Lcom/tencent/mm/sdk/platformtools/ae;
          //   118: ldc 90
          //   120: ldc2_w 97
          //   123: invokevirtual 102	com/tencent/mm/sdk/platformtools/ae:sendEmptyMessageDelayed	(IJ)Z
          //   126: pop
          //   127: ldc 63
          //   129: ldc 104
          //   131: iconst_1
          //   132: anewarray 4	java/lang/Object
          //   135: dup
          //   136: iconst_0
          //   137: aload 14
          //   139: getfield 107	com/tencent/mm/booter/notification/a/f:fLj	Z
          //   142: invokestatic 113	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
          //   145: aastore
          //   146: invokestatic 116	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   149: aload 14
          //   151: getfield 107	com/tencent/mm/booter/notification/a/f:fLj	Z
          //   154: istore 9
          //   156: iload 9
          //   158: ifeq +66 -> 224
          //   161: aload 14
          //   163: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   166: ifnull +52 -> 218
          //   169: aload 14
          //   171: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   174: invokevirtual 126	android/media/MediaPlayer:isPlaying	()Z
          //   177: ifeq +11 -> 188
          //   180: aload 14
          //   182: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   185: invokevirtual 129	android/media/MediaPlayer:stop	()V
          //   188: aload 14
          //   190: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   193: invokevirtual 132	android/media/MediaPlayer:release	()V
          //   196: ldc 63
          //   198: ldc -122
          //   200: iconst_1
          //   201: anewarray 4	java/lang/Object
          //   204: dup
          //   205: iconst_0
          //   206: aload 14
          //   208: getfield 107	com/tencent/mm/booter/notification/a/f:fLj	Z
          //   211: invokestatic 113	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
          //   214: aastore
          //   215: invokestatic 116	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   218: aload 14
          //   220: iconst_0
          //   221: putfield 107	com/tencent/mm/booter/notification/a/f:fLj	Z
          //   224: aload 14
          //   226: new 136	com/tencent/mm/compatible/b/i
          //   229: dup
          //   230: invokespecial 137	com/tencent/mm/compatible/b/i:<init>	()V
          //   233: putfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   236: ldc 63
          //   238: ldc -117
          //   240: iconst_1
          //   241: anewarray 4	java/lang/Object
          //   244: dup
          //   245: iconst_0
          //   246: aload 14
          //   248: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   251: aastore
          //   252: invokestatic 116	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   255: aload 14
          //   257: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   260: astore 17
          //   262: invokestatic 145	java/lang/System:currentTimeMillis	()J
          //   265: lstore 11
          //   267: aload 15
          //   269: invokestatic 151	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
          //   272: ifeq +473 -> 745
          //   275: iconst_2
          //   276: invokestatic 157	android/media/RingtoneManager:getDefaultUri	(I)Landroid/net/Uri;
          //   279: astore 13
          //   281: aload 13
          //   283: ifnull +15 -> 298
          //   286: aload 17
          //   288: aload 14
          //   290: getfield 55	com/tencent/mm/booter/notification/a/f:context	Landroid/content/Context;
          //   293: aload 13
          //   295: invokevirtual 161	android/media/MediaPlayer:setDataSource	(Landroid/content/Context;Landroid/net/Uri;)V
          //   298: ldc 63
          //   300: ldc -93
          //   302: iconst_2
          //   303: anewarray 4	java/lang/Object
          //   306: dup
          //   307: iconst_0
          //   308: invokestatic 169	java/lang/Thread:currentThread	()Ljava/lang/Thread;
          //   311: invokevirtual 172	java/lang/Thread:getId	()J
          //   314: invokestatic 177	java/lang/Long:valueOf	(J)Ljava/lang/Long;
          //   317: aastore
          //   318: dup
          //   319: iconst_1
          //   320: invokestatic 145	java/lang/System:currentTimeMillis	()J
          //   323: lload 11
          //   325: lsub
          //   326: invokestatic 177	java/lang/Long:valueOf	(J)Ljava/lang/Long;
          //   329: aastore
          //   330: invokestatic 116	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   333: aload 16
          //   335: invokevirtual 180	android/media/AudioManager:isWiredHeadsetOn	()Z
          //   338: ifeq +564 -> 902
          //   341: invokestatic 186	com/tencent/mm/compatible/b/e:sj	()I
          //   344: pop
          //   345: ldc 63
          //   347: ldc -68
          //   349: iconst_1
          //   350: anewarray 4	java/lang/Object
          //   353: dup
          //   354: iconst_0
          //   355: iconst_0
          //   356: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
          //   359: aastore
          //   360: invokestatic 196	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   363: aload 16
          //   365: iconst_0
          //   366: invokevirtual 85	android/media/AudioManager:getStreamVolume	(I)I
          //   369: i2f
          //   370: fstore_1
          //   371: aload 16
          //   373: iconst_3
          //   374: invokevirtual 85	android/media/AudioManager:getStreamVolume	(I)I
          //   377: i2f
          //   378: fstore 5
          //   380: aload 16
          //   382: iconst_0
          //   383: invokevirtual 199	android/media/AudioManager:getStreamMaxVolume	(I)I
          //   386: i2f
          //   387: fstore_2
          //   388: aload 16
          //   390: iconst_3
          //   391: invokevirtual 199	android/media/AudioManager:getStreamMaxVolume	(I)I
          //   394: i2f
          //   395: fstore 6
          //   397: fload_1
          //   398: fload_2
          //   399: fdiv
          //   400: fstore_3
          //   401: fload 5
          //   403: fload 6
          //   405: fdiv
          //   406: fstore 4
          //   408: ldc 63
          //   410: ldc -55
          //   412: iconst_3
          //   413: anewarray 4	java/lang/Object
          //   416: dup
          //   417: iconst_0
          //   418: fload_1
          //   419: invokestatic 206	java/lang/Float:valueOf	(F)Ljava/lang/Float;
          //   422: aastore
          //   423: dup
          //   424: iconst_1
          //   425: fload_2
          //   426: invokestatic 206	java/lang/Float:valueOf	(F)Ljava/lang/Float;
          //   429: aastore
          //   430: dup
          //   431: iconst_2
          //   432: fload_3
          //   433: invokestatic 206	java/lang/Float:valueOf	(F)Ljava/lang/Float;
          //   436: aastore
          //   437: invokestatic 196	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   440: ldc 63
          //   442: ldc -48
          //   444: iconst_3
          //   445: anewarray 4	java/lang/Object
          //   448: dup
          //   449: iconst_0
          //   450: fload 5
          //   452: invokestatic 206	java/lang/Float:valueOf	(F)Ljava/lang/Float;
          //   455: aastore
          //   456: dup
          //   457: iconst_1
          //   458: fload 6
          //   460: invokestatic 206	java/lang/Float:valueOf	(F)Ljava/lang/Float;
          //   463: aastore
          //   464: dup
          //   465: iconst_2
          //   466: fload 4
          //   468: invokestatic 206	java/lang/Float:valueOf	(F)Ljava/lang/Float;
          //   471: aastore
          //   472: invokestatic 196	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   475: fload_3
          //   476: fload 4
          //   478: fcmpl
          //   479: ifle +26 -> 505
          //   482: fload_2
          //   483: fload 4
          //   485: fmul
          //   486: fstore_1
          //   487: ldc 63
          //   489: ldc -46
          //   491: iconst_1
          //   492: anewarray 4	java/lang/Object
          //   495: dup
          //   496: iconst_0
          //   497: fload_1
          //   498: invokestatic 206	java/lang/Float:valueOf	(F)Ljava/lang/Float;
          //   501: aastore
          //   502: invokestatic 196	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   505: aload 16
          //   507: iconst_0
          //   508: invokevirtual 214	android/media/AudioManager:setSpeakerphoneOn	(Z)V
          //   511: ldc 63
          //   513: ldc -40
          //   515: iconst_1
          //   516: anewarray 4	java/lang/Object
          //   519: dup
          //   520: iconst_0
          //   521: getstatic 222	com/tencent/mm/compatible/d/p:fQL	Lcom/tencent/mm/compatible/d/j;
          //   524: getfield 228	com/tencent/mm/compatible/d/j:fQi	I
          //   527: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
          //   530: aastore
          //   531: invokestatic 116	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   534: getstatic 222	com/tencent/mm/compatible/d/p:fQL	Lcom/tencent/mm/compatible/d/j;
          //   537: getfield 228	com/tencent/mm/compatible/d/j:fQi	I
          //   540: iconst_1
          //   541: if_icmpne +324 -> 865
          //   544: ldc 63
          //   546: ldc -26
          //   548: invokestatic 232	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
          //   551: aload 16
          //   553: invokevirtual 235	android/media/AudioManager:getMode	()I
          //   556: ifne +9 -> 565
          //   559: aload 16
          //   561: iconst_3
          //   562: invokevirtual 238	android/media/AudioManager:setMode	(I)V
          //   565: aload 14
          //   567: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   570: new 240	com/tencent/mm/booter/notification/a/f$3
          //   573: dup
          //   574: aload 14
          //   576: aload 16
          //   578: invokespecial 243	com/tencent/mm/booter/notification/a/f$3:<init>	(Lcom/tencent/mm/booter/notification/a/f;Landroid/media/AudioManager;)V
          //   581: invokevirtual 247	android/media/MediaPlayer:setOnCompletionListener	(Landroid/media/MediaPlayer$OnCompletionListener;)V
          //   584: aload 14
          //   586: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   589: new 249	com/tencent/mm/booter/notification/a/f$4
          //   592: dup
          //   593: aload 14
          //   595: aload 16
          //   597: invokespecial 250	com/tencent/mm/booter/notification/a/f$4:<init>	(Lcom/tencent/mm/booter/notification/a/f;Landroid/media/AudioManager;)V
          //   600: invokevirtual 254	android/media/MediaPlayer:setOnErrorListener	(Landroid/media/MediaPlayer$OnErrorListener;)V
          //   603: aload 14
          //   605: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   608: iconst_0
          //   609: invokevirtual 257	android/media/MediaPlayer:setAudioStreamType	(I)V
          //   612: aload 14
          //   614: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   617: iconst_1
          //   618: invokevirtual 260	android/media/MediaPlayer:setLooping	(Z)V
          //   621: aload 14
          //   623: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   626: invokevirtual 263	android/media/MediaPlayer:prepare	()V
          //   629: aload 14
          //   631: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   634: fload_1
          //   635: fload_2
          //   636: fdiv
          //   637: fload_1
          //   638: fload_2
          //   639: fdiv
          //   640: invokevirtual 267	android/media/MediaPlayer:setVolume	(FF)V
          //   643: aload 14
          //   645: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   648: iconst_0
          //   649: invokevirtual 260	android/media/MediaPlayer:setLooping	(Z)V
          //   652: aload 14
          //   654: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   657: invokevirtual 270	android/media/MediaPlayer:start	()V
          //   660: aload 14
          //   662: iconst_1
          //   663: putfield 107	com/tencent/mm/booter/notification/a/f:fLj	Z
          //   666: ldc2_w 49
          //   669: ldc 51
          //   671: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
          //   674: return
          //   675: astore 13
          //   677: ldc 63
          //   679: aload 13
          //   681: ldc_w 272
          //   684: iconst_0
          //   685: anewarray 4	java/lang/Object
          //   688: invokestatic 276	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
          //   691: aload 14
          //   693: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   696: ifnull +11 -> 707
          //   699: aload 14
          //   701: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   704: invokevirtual 132	android/media/MediaPlayer:release	()V
          //   707: ldc2_w 49
          //   710: ldc 51
          //   712: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
          //   715: return
          //   716: astore 13
          //   718: ldc 63
          //   720: ldc_w 278
          //   723: invokestatic 71	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
          //   726: aload 14
          //   728: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   731: ifnull -513 -> 218
          //   734: aload 14
          //   736: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   739: invokevirtual 132	android/media/MediaPlayer:release	()V
          //   742: goto -524 -> 218
          //   745: iload 8
          //   747: ifeq +49 -> 796
          //   750: aload 14
          //   752: getfield 55	com/tencent/mm/booter/notification/a/f:context	Landroid/content/Context;
          //   755: invokevirtual 282	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
          //   758: aload 15
          //   760: invokevirtual 288	android/content/res/AssetManager:openFd	(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
          //   763: astore 13
          //   765: aload 17
          //   767: aload 13
          //   769: invokevirtual 294	android/content/res/AssetFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
          //   772: aload 13
          //   774: invokevirtual 297	android/content/res/AssetFileDescriptor:getStartOffset	()J
          //   777: aload 13
          //   779: invokevirtual 300	android/content/res/AssetFileDescriptor:getLength	()J
          //   782: invokevirtual 303	android/media/MediaPlayer:setDataSource	(Ljava/io/FileDescriptor;JJ)V
          //   785: aload 13
          //   787: invokevirtual 306	android/content/res/AssetFileDescriptor:close	()V
          //   790: aconst_null
          //   791: astore 13
          //   793: goto -512 -> 281
          //   796: aload 15
          //   798: invokestatic 312	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
          //   801: astore 13
          //   803: goto -522 -> 281
          //   806: astore 13
          //   808: aload 15
          //   810: invokestatic 151	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
          //   813: ifne +24 -> 837
          //   816: iconst_2
          //   817: invokestatic 157	android/media/RingtoneManager:getDefaultUri	(I)Landroid/net/Uri;
          //   820: astore 13
          //   822: aload 17
          //   824: aload 14
          //   826: getfield 55	com/tencent/mm/booter/notification/a/f:context	Landroid/content/Context;
          //   829: aload 13
          //   831: invokevirtual 161	android/media/MediaPlayer:setDataSource	(Landroid/content/Context;Landroid/net/Uri;)V
          //   834: goto -536 -> 298
          //   837: ldc 63
          //   839: ldc_w 314
          //   842: iconst_2
          //   843: anewarray 4	java/lang/Object
          //   846: dup
          //   847: iconst_0
          //   848: aload 15
          //   850: aastore
          //   851: dup
          //   852: iconst_1
          //   853: iload 8
          //   855: invokestatic 113	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
          //   858: aastore
          //   859: invokestatic 116	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   862: goto -564 -> 298
          //   865: aload 14
          //   867: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   870: new 316	com/tencent/mm/booter/notification/a/f$5
          //   873: dup
          //   874: aload 14
          //   876: invokespecial 319	com/tencent/mm/booter/notification/a/f$5:<init>	(Lcom/tencent/mm/booter/notification/a/f;)V
          //   879: invokevirtual 247	android/media/MediaPlayer:setOnCompletionListener	(Landroid/media/MediaPlayer$OnCompletionListener;)V
          //   882: aload 14
          //   884: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   887: new 321	com/tencent/mm/booter/notification/a/f$6
          //   890: dup
          //   891: aload 14
          //   893: invokespecial 322	com/tencent/mm/booter/notification/a/f$6:<init>	(Lcom/tencent/mm/booter/notification/a/f;)V
          //   896: invokevirtual 254	android/media/MediaPlayer:setOnErrorListener	(Landroid/media/MediaPlayer$OnErrorListener;)V
          //   899: goto -296 -> 603
          //   902: ldc 63
          //   904: ldc_w 324
          //   907: iconst_2
          //   908: anewarray 4	java/lang/Object
          //   911: dup
          //   912: iconst_0
          //   913: aload 16
          //   915: iconst_5
          //   916: invokevirtual 85	android/media/AudioManager:getStreamVolume	(I)I
          //   919: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
          //   922: aastore
          //   923: dup
          //   924: iconst_1
          //   925: aload 15
          //   927: aastore
          //   928: invokestatic 196	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   931: aload 14
          //   933: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   936: new 326	com/tencent/mm/booter/notification/a/f$7
          //   939: dup
          //   940: aload 14
          //   942: invokespecial 327	com/tencent/mm/booter/notification/a/f$7:<init>	(Lcom/tencent/mm/booter/notification/a/f;)V
          //   945: invokevirtual 247	android/media/MediaPlayer:setOnCompletionListener	(Landroid/media/MediaPlayer$OnCompletionListener;)V
          //   948: aload 14
          //   950: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   953: new 329	com/tencent/mm/booter/notification/a/f$8
          //   956: dup
          //   957: aload 14
          //   959: invokespecial 330	com/tencent/mm/booter/notification/a/f$8:<init>	(Lcom/tencent/mm/booter/notification/a/f;)V
          //   962: invokevirtual 254	android/media/MediaPlayer:setOnErrorListener	(Landroid/media/MediaPlayer$OnErrorListener;)V
          //   965: aload 14
          //   967: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   970: iconst_5
          //   971: invokevirtual 257	android/media/MediaPlayer:setAudioStreamType	(I)V
          //   974: aload 14
          //   976: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   979: iconst_1
          //   980: invokevirtual 260	android/media/MediaPlayer:setLooping	(Z)V
          //   983: aload 14
          //   985: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   988: invokevirtual 263	android/media/MediaPlayer:prepare	()V
          //   991: aload 14
          //   993: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   996: iconst_0
          //   997: invokevirtual 260	android/media/MediaPlayer:setLooping	(Z)V
          //   1000: aload 14
          //   1002: getfield 120	com/tencent/mm/booter/notification/a/f:fLk	Landroid/media/MediaPlayer;
          //   1005: invokevirtual 270	android/media/MediaPlayer:start	()V
          //   1008: aload 14
          //   1010: iconst_1
          //   1011: putfield 107	com/tencent/mm/booter/notification/a/f:fLj	Z
          //   1014: aload 14
          //   1016: getfield 107	com/tencent/mm/booter/notification/a/f:fLj	Z
          //   1019: istore 10
          //   1021: invokestatic 336	android/os/Looper:myLooper	()Landroid/os/Looper;
          //   1024: ifnull +60 -> 1084
          //   1027: iconst_1
          //   1028: istore 8
          //   1030: invokestatic 339	android/os/Looper:getMainLooper	()Landroid/os/Looper;
          //   1033: ifnull +57 -> 1090
          //   1036: iconst_1
          //   1037: istore 9
          //   1039: ldc 63
          //   1041: ldc_w 341
          //   1044: iconst_3
          //   1045: anewarray 4	java/lang/Object
          //   1048: dup
          //   1049: iconst_0
          //   1050: iload 10
          //   1052: invokestatic 113	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
          //   1055: aastore
          //   1056: dup
          //   1057: iconst_1
          //   1058: iload 8
          //   1060: invokestatic 113	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
          //   1063: aastore
          //   1064: dup
          //   1065: iconst_2
          //   1066: iload 9
          //   1068: invokestatic 113	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
          //   1071: aastore
          //   1072: invokestatic 116	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   1075: ldc2_w 49
          //   1078: ldc 51
          //   1080: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
          //   1083: return
          //   1084: iconst_0
          //   1085: istore 8
          //   1087: goto -57 -> 1030
          //   1090: iconst_0
          //   1091: istore 9
          //   1093: goto -54 -> 1039
          //   1096: astore 13
          //   1098: ldc 63
          //   1100: aload 13
          //   1102: ldc_w 343
          //   1105: iconst_0
          //   1106: anewarray 4	java/lang/Object
          //   1109: invokestatic 276	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
          //   1112: ldc2_w 49
          //   1115: ldc 51
          //   1117: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
          //   1120: return
          // Local variable table:
          //   start	length	slot	name	signature
          //   0	1121	0	this	2
          //   370	268	1	f1	float
          //   387	252	2	f2	float
          //   400	76	3	f3	float
          //   406	78	4	f4	float
          //   378	73	5	f5	float
          //   395	64	6	f6	float
          //   87	3	7	i	int
          //   24	1062	8	bool1	boolean
          //   154	938	9	bool2	boolean
          //   1019	32	10	bool3	boolean
          //   265	59	11	l	long
          //   279	15	13	localUri1	android.net.Uri
          //   675	5	13	localException1	Exception
          //   716	1	13	localIllegalStateException	IllegalStateException
          //   763	39	13	localObject	Object
          //   806	1	13	localIOException	java.io.IOException
          //   820	10	13	localUri2	android.net.Uri
          //   1096	5	13	localException2	Exception
          //   12	1003	14	localf	f
          //   18	908	15	str	String
          //   79	835	16	localAudioManager	AudioManager
          //   260	563	17	localMediaPlayer	MediaPlayer
          // Exception table:
          //   from	to	target	type
          //   66	89	675	java/lang/Exception
          //   103	156	675	java/lang/Exception
          //   161	188	675	java/lang/Exception
          //   188	218	675	java/lang/Exception
          //   218	224	675	java/lang/Exception
          //   224	281	675	java/lang/Exception
          //   286	298	675	java/lang/Exception
          //   298	475	675	java/lang/Exception
          //   487	505	675	java/lang/Exception
          //   505	565	675	java/lang/Exception
          //   565	603	675	java/lang/Exception
          //   603	674	675	java/lang/Exception
          //   718	742	675	java/lang/Exception
          //   750	790	675	java/lang/Exception
          //   796	803	675	java/lang/Exception
          //   808	834	675	java/lang/Exception
          //   837	862	675	java/lang/Exception
          //   865	899	675	java/lang/Exception
          //   902	1027	675	java/lang/Exception
          //   1030	1036	675	java/lang/Exception
          //   1039	1075	675	java/lang/Exception
          //   161	188	716	java/lang/IllegalStateException
          //   188	218	716	java/lang/IllegalStateException
          //   286	298	806	java/io/IOException
          //   691	707	1096	java/lang/Exception
        }
      });
      GMTrace.o(17446559809536L, 129987);
      return;
    }
    finally {}
  }
  
  private static final class a
  {
    public static final f fLr;
    
    static
    {
      GMTrace.i(528683630592L, 3939);
      fLr = new f();
      GMTrace.o(528683630592L, 3939);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\booter\notification\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */