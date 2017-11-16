package com.tencent.rtmp.sharp.jni;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@TargetApi(16)
public class AudioDeviceInterface
{
  private static boolean _dumpEnable = false;
  private static boolean _logEnable = true;
  private TraeAudioSession _as = null;
  private AudioManager _audioManager = null;
  private AudioRecord _audioRecord = null;
  private boolean _audioRouteChanged = false;
  private int _audioSource = 0;
  private int _audioSourcePolicy = -1;
  private int _audioStreamTypePolicy = -1;
  private AudioTrack _audioTrack = null;
  private int _bufferedPlaySamples = 0;
  private int _bufferedRecSamples = 0;
  private int _channelOutType = 4;
  private String _connectedDev = "DEVICE_NONE";
  private Context _context = null;
  private boolean _doPlayInit = true;
  private boolean _doRecInit = true;
  private TraeAudioSession _init_as = null;
  private boolean _isPlaying = false;
  private boolean _isRecording = false;
  private int _modePolicy = -1;
  private ByteBuffer _playBuffer;
  private final ReentrantLock _playLock = new ReentrantLock();
  private int _playPosition = 0;
  private int _playSamplerate = 8000;
  private File _play_dump = null;
  private FileOutputStream _play_out = null;
  public boolean _preDone = false;
  public Condition _precon = this._prelock.newCondition();
  public ReentrantLock _prelock = new ReentrantLock();
  private ByteBuffer _recBuffer;
  private final ReentrantLock _recLock = new ReentrantLock();
  private File _rec_dump = null;
  private FileOutputStream _rec_out = null;
  private int _sceneModeKey = 0;
  private int _sessionId = 0;
  private int _streamType = 0;
  private byte[] _tempBufPlay;
  private byte[] _tempBufRec;
  private int switchState = 0;
  public boolean usingJava = true;
  
  public AudioDeviceInterface()
  {
    try
    {
      this._playBuffer = ByteBuffer.allocateDirect(1920);
      this._recBuffer = ByteBuffer.allocateDirect(1920);
      this._tempBufPlay = new byte['ހ'];
      this._tempBufRec = new byte['ހ'];
      int i = Build.VERSION.SDK_INT;
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, "AudioDeviceInterface apiLevel:" + i);
      }
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, " SDK_INT:" + Build.VERSION.SDK_INT);
      }
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, "manufacture:" + Build.MANUFACTURER);
      }
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, "MODEL:" + Build.MODEL);
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        if (QLog.isColorLevel()) {
          QLog.w("TRAE", 2, localException.getMessage());
        }
      }
    }
  }
  
  private int GetPlayoutVolume()
  {
    if ((this._audioManager == null) && (this._context != null)) {
      this._audioManager = ((AudioManager)this._context.getSystemService("audio"));
    }
    int i = -1;
    if (this._audioManager != null) {
      i = this._audioManager.getStreamVolume(0);
    }
    return i;
  }
  
  /* Error */
  private int InitPlayback(int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   3: ifeq +25 -> 28
    //   6: ldc -72
    //   8: iconst_2
    //   9: new 186	java/lang/StringBuilder
    //   12: dup
    //   13: ldc -13
    //   15: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   18: iload_1
    //   19: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   22: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   25: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   28: aload_0
    //   29: getfield 119	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_isPlaying	Z
    //   32: ifne +15 -> 47
    //   35: aload_0
    //   36: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   39: ifnonnull +8 -> 47
    //   42: iload_2
    //   43: iconst_2
    //   44: if_icmple +36 -> 80
    //   47: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   50: ifeq +28 -> 78
    //   53: ldc -72
    //   55: iconst_2
    //   56: new 186	java/lang/StringBuilder
    //   59: dup
    //   60: ldc -11
    //   62: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   65: aload_0
    //   66: getfield 119	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_isPlaying	Z
    //   69: invokevirtual 248	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   72: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   75: invokestatic 251	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   78: iconst_m1
    //   79: ireturn
    //   80: aload_0
    //   81: getfield 104	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   84: ifnonnull +19 -> 103
    //   87: aload_0
    //   88: aload_0
    //   89: getfield 96	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_context	Landroid/content/Context;
    //   92: ldc -29
    //   94: invokevirtual 233	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   97: checkcast 235	android/media/AudioManager
    //   100: putfield 104	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   103: iload_2
    //   104: iconst_2
    //   105: if_icmpne +497 -> 602
    //   108: aload_0
    //   109: bipush 12
    //   111: putfield 88	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_channelOutType	I
    //   114: aload_0
    //   115: iload_1
    //   116: putfield 86	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playSamplerate	I
    //   119: iload_1
    //   120: aload_0
    //   121: getfield 88	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_channelOutType	I
    //   124: iconst_2
    //   125: invokestatic 257	android/media/AudioTrack:getMinBufferSize	(III)I
    //   128: istore 6
    //   130: aload_0
    //   131: getfield 88	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_channelOutType	I
    //   134: bipush 12
    //   136: if_icmpne +18 -> 154
    //   139: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   142: ifeq +468 -> 610
    //   145: ldc -72
    //   147: iconst_2
    //   148: ldc_w 259
    //   151: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   154: iload_1
    //   155: bipush 20
    //   157: imul
    //   158: iconst_1
    //   159: imul
    //   160: iconst_2
    //   161: imul
    //   162: sipush 1000
    //   165: idiv
    //   166: istore_2
    //   167: aload_0
    //   168: getfield 88	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_channelOutType	I
    //   171: bipush 12
    //   173: if_icmpne +722 -> 895
    //   176: iload_2
    //   177: iconst_2
    //   178: imul
    //   179: istore_2
    //   180: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   183: ifeq +37 -> 220
    //   186: ldc -72
    //   188: iconst_2
    //   189: new 186	java/lang/StringBuilder
    //   192: dup
    //   193: ldc_w 261
    //   196: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   199: iload 6
    //   201: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   204: ldc_w 263
    //   207: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: iload_2
    //   211: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   214: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   217: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   220: aload_0
    //   221: iconst_0
    //   222: putfield 123	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_bufferedPlaySamples	I
    //   225: aload_0
    //   226: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   229: ifnull +15 -> 244
    //   232: aload_0
    //   233: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   236: invokevirtual 266	android/media/AudioTrack:release	()V
    //   239: aload_0
    //   240: aconst_null
    //   241: putfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   244: iconst_4
    //   245: newarray <illegal type>
    //   247: astore 7
    //   249: aload 7
    //   251: dup
    //   252: iconst_0
    //   253: iconst_0
    //   254: iastore
    //   255: dup
    //   256: iconst_1
    //   257: iconst_0
    //   258: iastore
    //   259: dup
    //   260: iconst_2
    //   261: iconst_3
    //   262: iastore
    //   263: dup
    //   264: iconst_3
    //   265: iconst_1
    //   266: iastore
    //   267: pop
    //   268: aload_0
    //   269: aload_0
    //   270: getfield 102	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioStreamTypePolicy	I
    //   273: invokestatic 271	com/tencent/rtmp/sharp/jni/TraeAudioManager:getAudioStreamType	(I)I
    //   276: putfield 84	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   279: aload_0
    //   280: getfield 141	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRouteChanged	Z
    //   283: ifeq +81 -> 364
    //   286: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   289: ifeq +42 -> 331
    //   292: ldc -72
    //   294: iconst_2
    //   295: new 186	java/lang/StringBuilder
    //   298: dup
    //   299: ldc_w 273
    //   302: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   305: aload_0
    //   306: getfield 141	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRouteChanged	Z
    //   309: invokevirtual 248	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   312: ldc_w 275
    //   315: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   318: aload_0
    //   319: getfield 84	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   322: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   325: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   328: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   331: aload_0
    //   332: getfield 104	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   335: invokevirtual 278	android/media/AudioManager:getMode	()I
    //   338: ifne +298 -> 636
    //   341: aload_0
    //   342: getfield 139	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_connectedDev	Ljava/lang/String;
    //   345: ldc_w 280
    //   348: invokevirtual 286	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   351: ifeq +285 -> 636
    //   354: aload_0
    //   355: iconst_3
    //   356: putfield 84	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   359: aload_0
    //   360: iconst_0
    //   361: putfield 141	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRouteChanged	Z
    //   364: aload 7
    //   366: iconst_0
    //   367: aload_0
    //   368: getfield 84	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   371: iastore
    //   372: iconst_0
    //   373: istore_3
    //   374: iload 6
    //   376: istore_1
    //   377: iload_3
    //   378: iconst_4
    //   379: if_icmpge +339 -> 718
    //   382: aload_0
    //   383: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   386: ifnonnull +332 -> 718
    //   389: aload_0
    //   390: aload 7
    //   392: iload_3
    //   393: iaload
    //   394: putfield 84	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   397: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   400: ifeq +43 -> 443
    //   403: ldc -72
    //   405: iconst_2
    //   406: new 186	java/lang/StringBuilder
    //   409: dup
    //   410: ldc_w 288
    //   413: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   416: iload 6
    //   418: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   421: ldc_w 290
    //   424: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   427: aload_0
    //   428: getfield 84	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   431: invokestatic 293	android/media/AudioTrack:getNativeOutputSampleRate	(I)I
    //   434: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   437: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   440: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   443: iconst_1
    //   444: istore 4
    //   446: iload 4
    //   448: iconst_2
    //   449: if_icmpgt +262 -> 711
    //   452: iload 6
    //   454: iload 4
    //   456: imul
    //   457: istore 5
    //   459: iload 5
    //   461: iload_2
    //   462: iconst_4
    //   463: imul
    //   464: if_icmpge +9 -> 473
    //   467: iload 4
    //   469: iconst_2
    //   470: if_icmplt +99 -> 569
    //   473: aload_0
    //   474: new 253	android/media/AudioTrack
    //   477: dup
    //   478: aload_0
    //   479: getfield 84	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   482: aload_0
    //   483: getfield 86	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playSamplerate	I
    //   486: aload_0
    //   487: getfield 88	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_channelOutType	I
    //   490: iconst_2
    //   491: iload 5
    //   493: iconst_1
    //   494: invokespecial 296	android/media/AudioTrack:<init>	(IIIIII)V
    //   497: putfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   500: iload 5
    //   502: istore_1
    //   503: aload_0
    //   504: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   507: invokevirtual 299	android/media/AudioTrack:getState	()I
    //   510: iconst_1
    //   511: if_icmpeq +200 -> 711
    //   514: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   517: ifeq +40 -> 557
    //   520: ldc -72
    //   522: iconst_2
    //   523: new 186	java/lang/StringBuilder
    //   526: dup
    //   527: ldc_w 301
    //   530: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   533: iload 5
    //   535: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   538: ldc_w 303
    //   541: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   544: aload_0
    //   545: getfield 86	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playSamplerate	I
    //   548: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   551: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   554: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   557: aload_0
    //   558: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   561: invokevirtual 266	android/media/AudioTrack:release	()V
    //   564: aload_0
    //   565: aconst_null
    //   566: putfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   569: iload 4
    //   571: iconst_1
    //   572: iadd
    //   573: istore 4
    //   575: iload 5
    //   577: istore_1
    //   578: goto -132 -> 446
    //   581: astore 7
    //   583: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   586: ifeq +14 -> 600
    //   589: ldc -72
    //   591: iconst_2
    //   592: aload 7
    //   594: invokevirtual 223	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   597: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   600: iconst_m1
    //   601: ireturn
    //   602: aload_0
    //   603: iconst_4
    //   604: putfield 88	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_channelOutType	I
    //   607: goto -493 -> 114
    //   610: aload_0
    //   611: getfield 88	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_channelOutType	I
    //   614: iconst_4
    //   615: if_icmpne -461 -> 154
    //   618: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   621: ifeq -467 -> 154
    //   624: ldc -72
    //   626: iconst_2
    //   627: ldc_w 305
    //   630: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   633: goto -479 -> 154
    //   636: aload_0
    //   637: iconst_0
    //   638: putfield 84	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   641: goto -282 -> 359
    //   644: astore 8
    //   646: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   649: ifeq +40 -> 689
    //   652: ldc -72
    //   654: iconst_2
    //   655: new 186	java/lang/StringBuilder
    //   658: dup
    //   659: invokespecial 306	java/lang/StringBuilder:<init>	()V
    //   662: aload 8
    //   664: invokevirtual 223	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   667: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   670: ldc_w 308
    //   673: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   676: aload_0
    //   677: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   680: invokevirtual 311	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   683: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   686: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   689: aload_0
    //   690: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   693: ifnull +10 -> 703
    //   696: aload_0
    //   697: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   700: invokevirtual 266	android/media/AudioTrack:release	()V
    //   703: aload_0
    //   704: aconst_null
    //   705: putfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   708: goto -139 -> 569
    //   711: iload_3
    //   712: iconst_1
    //   713: iadd
    //   714: istore_3
    //   715: goto -338 -> 377
    //   718: aload_0
    //   719: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   722: ifnonnull +20 -> 742
    //   725: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   728: ifeq +12 -> 740
    //   731: ldc -72
    //   733: iconst_2
    //   734: ldc_w 313
    //   737: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   740: iconst_m1
    //   741: ireturn
    //   742: aload_0
    //   743: getfield 135	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_as	Lcom/tencent/rtmp/sharp/jni/TraeAudioSession;
    //   746: ifnull +29 -> 775
    //   749: aload_0
    //   750: getfield 104	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   753: ifnull +22 -> 775
    //   756: aload_0
    //   757: getfield 135	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_as	Lcom/tencent/rtmp/sharp/jni/TraeAudioSession;
    //   760: aload_0
    //   761: getfield 104	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   764: invokevirtual 278	android/media/AudioManager:getMode	()I
    //   767: aload_0
    //   768: getfield 84	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   771: invokevirtual 318	com/tencent/rtmp/sharp/jni/TraeAudioSession:voiceCallAudioParamChanged	(II)I
    //   774: pop
    //   775: aload_0
    //   776: aload_0
    //   777: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   780: invokevirtual 321	android/media/AudioTrack:getPlaybackHeadPosition	()I
    //   783: putfield 125	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playPosition	I
    //   786: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   789: ifeq +65 -> 854
    //   792: ldc -72
    //   794: iconst_2
    //   795: new 186	java/lang/StringBuilder
    //   798: dup
    //   799: ldc_w 323
    //   802: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   805: aload_0
    //   806: getfield 84	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   809: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   812: ldc_w 325
    //   815: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   818: aload_0
    //   819: getfield 86	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playSamplerate	I
    //   822: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   825: ldc_w 327
    //   828: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   831: aload_0
    //   832: getfield 125	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playPosition	I
    //   835: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   838: ldc_w 329
    //   841: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   844: iload_1
    //   845: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   848: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   851: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   854: aload_0
    //   855: getfield 104	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   858: astore 7
    //   860: aload_0
    //   861: getfield 139	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_connectedDev	Ljava/lang/String;
    //   864: ldc_w 331
    //   867: invokevirtual 286	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   870: ifeq +14 -> 884
    //   873: bipush 6
    //   875: istore_1
    //   876: aload 7
    //   878: iload_1
    //   879: invokestatic 335	com/tencent/rtmp/sharp/jni/TraeAudioManager:forceVolumeControlStream	(Landroid/media/AudioManager;I)V
    //   882: iconst_0
    //   883: ireturn
    //   884: aload_0
    //   885: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   888: invokevirtual 338	android/media/AudioTrack:getStreamType	()I
    //   891: istore_1
    //   892: goto -16 -> 876
    //   895: goto -715 -> 180
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	898	0	this	AudioDeviceInterface
    //   0	898	1	paramInt1	int
    //   0	898	2	paramInt2	int
    //   373	342	3	i	int
    //   444	130	4	j	int
    //   457	119	5	k	int
    //   128	329	6	m	int
    //   247	144	7	arrayOfInt	int[]
    //   581	12	7	localException1	Exception
    //   858	19	7	localAudioManager	AudioManager
    //   644	19	8	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   87	103	581	java/lang/Exception
    //   473	500	644	java/lang/Exception
  }
  
  private int InitRecording(int paramInt1, int paramInt2)
  {
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 2, "InitRecording entry:" + paramInt1);
    }
    if ((this._isRecording) || (this._audioRecord != null) || (paramInt2 > 2))
    {
      if (QLog.isColorLevel()) {
        QLog.e("TRAE", 2, "InitRecording _isRecording:" + this._isRecording);
      }
      return -1;
    }
    int i = 16;
    if (paramInt2 == 2) {
      i = 12;
    }
    int n = AudioRecord.getMinBufferSize(paramInt1, i, 2);
    int i1 = paramInt1 * 20 * paramInt2 * 2 / 1000;
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 2, "InitRecording: min rec buf size is " + n + " sr:" + getLowlatencySamplerate() + " fp" + getLowlatencyFramesPerBuffer() + " 20msFZ:" + i1);
    }
    this._bufferedRecSamples = (paramInt1 * 5 / 200);
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 2, "  rough rec delay set to " + this._bufferedRecSamples);
    }
    if (this._audioRecord != null)
    {
      this._audioRecord.release();
      this._audioRecord = null;
    }
    int[] arrayOfInt = new int[4];
    int[] tmp251_249 = arrayOfInt;
    tmp251_249[0] = 0;
    int[] tmp255_251 = tmp251_249;
    tmp255_251[1] = 1;
    int[] tmp259_255 = tmp255_251;
    tmp259_255[2] = 5;
    int[] tmp263_259 = tmp259_255;
    tmp263_259[3] = 0;
    tmp263_259;
    arrayOfInt[0] = TraeAudioManager.getAudioSource(this._audioSourcePolicy);
    int j = 0;
    paramInt2 = n;
    while ((j < 4) && (this._audioRecord == null))
    {
      this._audioSource = arrayOfInt[j];
      int k = 1;
      for (;;)
      {
        if (k > 2) {
          break label516;
        }
        int m = n * k;
        if ((m >= i1 * 4) || (k >= 2)) {}
        try
        {
          this._audioRecord = new AudioRecord(this._audioSource, paramInt1, i, 2, m);
          paramInt2 = m;
          if (this._audioRecord.getState() == 1) {
            break label516;
          }
          if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "InitRecording:  rec not initialized,try agine,  minbufsize:" + m + " sr:" + paramInt1 + " as:" + this._audioSource);
          }
          this._audioRecord.release();
          this._audioRecord = null;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            if (QLog.isColorLevel()) {
              QLog.w("TRAE", 2, localException.getMessage() + " _audioRecord:" + this._audioRecord);
            }
            if (this._audioRecord != null) {
              this._audioRecord.release();
            }
            this._audioRecord = null;
          }
        }
        k += 1;
        paramInt2 = m;
      }
      label516:
      j += 1;
    }
    if (this._audioRecord == null)
    {
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, "InitRecording fail!!!");
      }
      return -1;
    }
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 2, " [Config] InitRecording: audioSession:" + this._sessionId + " audioSource:" + this._audioSource + " rec sample rate set to " + paramInt1 + " recBufSize:" + paramInt2);
    }
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 2, "InitRecording exit");
    }
    return this._bufferedRecSamples;
  }
  
  private int InitSetting(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this._audioSourcePolicy = paramInt1;
    this._audioStreamTypePolicy = paramInt2;
    this._modePolicy = paramInt3;
    this._sceneModeKey = paramInt4;
    if ((this._sceneModeKey == 1) || (this._sceneModeKey == 2) || (this._sceneModeKey == 3)) {}
    for (TraeAudioManager.IsMusicScene = true;; TraeAudioManager.IsMusicScene = false)
    {
      TraeAudioManager.IsUpdateSceneFlag = true;
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, "InitSetting: _audioSourcePolicy:" + this._audioSourcePolicy + " _audioStreamTypePolicy:" + this._audioStreamTypePolicy + " _modePolicy:" + this._modePolicy + " sceneModeKey:" + paramInt4);
      }
      return 0;
    }
  }
  
  public static final void LogTraceEntry(String paramString)
  {
    if (!_logEnable) {}
    do
    {
      return;
      paramString = getTraceInfo() + " entry:" + paramString;
    } while (!QLog.isColorLevel());
    QLog.w("TRAE", 2, paramString);
  }
  
  public static final void LogTraceExit()
  {
    if (!_logEnable) {}
    String str;
    do
    {
      return;
      str = getTraceInfo() + " exit";
    } while (!QLog.isColorLevel());
    QLog.w("TRAE", 2, str);
  }
  
  private int OpenslesNeedResetAudioTrack(boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        if (!TraeAudioManager.isCloseSystemAPM(this._modePolicy)) {
          return -1;
        }
        if ((this._audioRouteChanged) || (paramBoolean))
        {
          if ((this._audioManager == null) && (this._context != null)) {
            this._audioManager = ((AudioManager)this._context.getSystemService("audio"));
          }
          if (this._audioManager == null) {
            return 0;
          }
          if ((this._audioManager.getMode() != 0) || (!this._connectedDev.equals("DEVICE_SPEAKERPHONE"))) {
            continue;
          }
          this._audioStreamTypePolicy = 3;
          this._audioRouteChanged = false;
        }
      }
      catch (Exception localException)
      {
        localException = localException;
        if (!QLog.isColorLevel()) {
          continue;
        }
        QLog.e("TRAE", 2, "PlayAudio Exception: " + localException.getMessage());
        continue;
      }
      finally {}
      return this._audioStreamTypePolicy;
      this._audioStreamTypePolicy = 0;
    }
  }
  
  /* Error */
  private int PlayAudio(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 119	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_isPlaying	Z
    //   4: ifne +67 -> 71
    //   7: iconst_1
    //   8: istore_2
    //   9: aload_0
    //   10: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   13: ifnonnull +63 -> 76
    //   16: iconst_1
    //   17: istore_3
    //   18: iload_2
    //   19: iload_3
    //   20: ior
    //   21: ifeq +60 -> 81
    //   24: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   27: ifeq +42 -> 69
    //   30: ldc -72
    //   32: iconst_2
    //   33: new 186	java/lang/StringBuilder
    //   36: dup
    //   37: ldc_w 426
    //   40: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   43: aload_0
    //   44: getfield 119	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_isPlaying	Z
    //   47: invokevirtual 248	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   50: ldc_w 428
    //   53: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: aload_0
    //   57: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   60: invokevirtual 311	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   63: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   66: invokestatic 251	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   69: iconst_m1
    //   70: ireturn
    //   71: iconst_0
    //   72: istore_2
    //   73: goto -64 -> 9
    //   76: iconst_0
    //   77: istore_3
    //   78: goto -60 -> 18
    //   81: aload_0
    //   82: getfield 109	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   85: invokevirtual 431	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   88: aload_0
    //   89: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   92: astore 10
    //   94: aload 10
    //   96: ifnonnull +13 -> 109
    //   99: aload_0
    //   100: getfield 109	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   103: invokevirtual 434	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   106: bipush -2
    //   108: ireturn
    //   109: aload_0
    //   110: getfield 113	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_doPlayInit	Z
    //   113: istore 7
    //   115: iload 7
    //   117: iconst_1
    //   118: if_icmpne +13 -> 131
    //   121: bipush -19
    //   123: invokestatic 440	android/os/Process:setThreadPriority	(I)V
    //   126: aload_0
    //   127: iconst_0
    //   128: putfield 113	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_doPlayInit	Z
    //   131: getstatic 70	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_dumpEnable	Z
    //   134: ifeq +27 -> 161
    //   137: aload_0
    //   138: getfield 133	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_play_out	Ljava/io/FileOutputStream;
    //   141: astore 10
    //   143: aload 10
    //   145: ifnull +16 -> 161
    //   148: aload_0
    //   149: getfield 133	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_play_out	Ljava/io/FileOutputStream;
    //   152: aload_0
    //   153: getfield 169	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_tempBufPlay	[B
    //   156: iconst_0
    //   157: iconst_0
    //   158: invokevirtual 446	java/io/FileOutputStream:write	([BII)V
    //   161: aload_0
    //   162: getfield 141	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRouteChanged	Z
    //   165: ifne +598 -> 763
    //   168: iconst_0
    //   169: istore_2
    //   170: aload_0
    //   171: getfield 165	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playBuffer	Ljava/nio/ByteBuffer;
    //   174: aload_0
    //   175: getfield 169	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_tempBufPlay	[B
    //   178: invokevirtual 450	java/nio/ByteBuffer:get	([B)Ljava/nio/ByteBuffer;
    //   181: pop
    //   182: iload_2
    //   183: ifeq +903 -> 1086
    //   186: aload_0
    //   187: getfield 165	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playBuffer	Ljava/nio/ByteBuffer;
    //   190: invokevirtual 454	java/nio/ByteBuffer:rewind	()Ljava/nio/Buffer;
    //   193: pop
    //   194: invokestatic 460	android/os/SystemClock:elapsedRealtime	()J
    //   197: lstore 8
    //   199: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   202: ifeq +45 -> 247
    //   205: ldc -72
    //   207: iconst_2
    //   208: new 186	java/lang/StringBuilder
    //   211: dup
    //   212: ldc_w 462
    //   215: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   218: aload_0
    //   219: getfield 84	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   222: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   225: ldc_w 464
    //   228: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   231: aload_0
    //   232: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   235: invokevirtual 338	android/media/AudioTrack:getStreamType	()I
    //   238: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   241: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   244: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   247: aload_0
    //   248: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   251: invokevirtual 467	android/media/AudioTrack:getPlayState	()I
    //   254: istore_2
    //   255: iload_2
    //   256: iconst_3
    //   257: if_icmpne +114 -> 371
    //   260: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   263: ifeq +12 -> 275
    //   266: ldc -72
    //   268: iconst_2
    //   269: ldc_w 469
    //   272: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   275: aload_0
    //   276: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   279: invokevirtual 472	android/media/AudioTrack:stop	()V
    //   282: aload_0
    //   283: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   286: invokevirtual 475	android/media/AudioTrack:flush	()V
    //   289: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   292: ifeq +32 -> 324
    //   295: ldc -72
    //   297: iconst_2
    //   298: new 186	java/lang/StringBuilder
    //   301: dup
    //   302: ldc_w 477
    //   305: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   308: aload_0
    //   309: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   312: invokevirtual 467	android/media/AudioTrack:getPlayState	()I
    //   315: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   318: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   321: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   324: aload_0
    //   325: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   328: invokevirtual 266	android/media/AudioTrack:release	()V
    //   331: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   334: ifeq +32 -> 366
    //   337: ldc -72
    //   339: iconst_2
    //   340: new 186	java/lang/StringBuilder
    //   343: dup
    //   344: ldc_w 479
    //   347: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   350: aload_0
    //   351: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   354: invokevirtual 467	android/media/AudioTrack:getPlayState	()I
    //   357: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   360: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   363: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   366: aload_0
    //   367: aconst_null
    //   368: putfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   371: aload_0
    //   372: getfield 86	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playSamplerate	I
    //   375: aload_0
    //   376: getfield 88	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_channelOutType	I
    //   379: iconst_2
    //   380: invokestatic 257	android/media/AudioTrack:getMinBufferSize	(III)I
    //   383: istore 5
    //   385: iconst_4
    //   386: newarray <illegal type>
    //   388: astore 10
    //   390: aload 10
    //   392: dup
    //   393: iconst_0
    //   394: iconst_0
    //   395: iastore
    //   396: dup
    //   397: iconst_1
    //   398: iconst_0
    //   399: iastore
    //   400: dup
    //   401: iconst_2
    //   402: iconst_3
    //   403: iastore
    //   404: dup
    //   405: iconst_3
    //   406: iconst_1
    //   407: iastore
    //   408: pop
    //   409: aload 10
    //   411: iconst_0
    //   412: aload_0
    //   413: getfield 84	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   416: iastore
    //   417: aload_0
    //   418: getfield 86	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playSamplerate	I
    //   421: bipush 20
    //   423: imul
    //   424: iconst_1
    //   425: imul
    //   426: iconst_2
    //   427: imul
    //   428: sipush 1000
    //   431: idiv
    //   432: istore_2
    //   433: aload_0
    //   434: getfield 88	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_channelOutType	I
    //   437: bipush 12
    //   439: if_icmpne +850 -> 1289
    //   442: iload_2
    //   443: iconst_2
    //   444: imul
    //   445: istore_2
    //   446: goto +843 -> 1289
    //   449: iload_3
    //   450: iconst_4
    //   451: if_icmpge +506 -> 957
    //   454: aload_0
    //   455: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   458: ifnonnull +499 -> 957
    //   461: aload_0
    //   462: aload 10
    //   464: iload_3
    //   465: iaload
    //   466: putfield 84	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   469: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   472: ifeq +43 -> 515
    //   475: ldc -72
    //   477: iconst_2
    //   478: new 186	java/lang/StringBuilder
    //   481: dup
    //   482: ldc_w 288
    //   485: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   488: iload 5
    //   490: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   493: ldc_w 290
    //   496: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   499: aload_0
    //   500: getfield 84	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   503: invokestatic 293	android/media/AudioTrack:getNativeOutputSampleRate	(I)I
    //   506: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   509: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   512: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   515: iconst_1
    //   516: istore 4
    //   518: iload 4
    //   520: iconst_2
    //   521: if_icmpgt +778 -> 1299
    //   524: iload 5
    //   526: iload 4
    //   528: imul
    //   529: istore 6
    //   531: iload 6
    //   533: iload_2
    //   534: iconst_4
    //   535: imul
    //   536: if_icmpge +9 -> 545
    //   539: iload 4
    //   541: iconst_2
    //   542: if_icmplt +128 -> 670
    //   545: aload_0
    //   546: new 253	android/media/AudioTrack
    //   549: dup
    //   550: aload_0
    //   551: getfield 84	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   554: aload_0
    //   555: getfield 86	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playSamplerate	I
    //   558: aload_0
    //   559: getfield 88	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_channelOutType	I
    //   562: iconst_2
    //   563: iload 6
    //   565: iconst_1
    //   566: invokespecial 296	android/media/AudioTrack:<init>	(IIIIII)V
    //   569: putfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   572: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   575: ifeq +29 -> 604
    //   578: ldc -72
    //   580: iconst_2
    //   581: new 186	java/lang/StringBuilder
    //   584: dup
    //   585: ldc_w 308
    //   588: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   591: aload_0
    //   592: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   595: invokevirtual 311	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   598: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   601: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   604: aload_0
    //   605: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   608: invokevirtual 299	android/media/AudioTrack:getState	()I
    //   611: iconst_1
    //   612: if_icmpeq +687 -> 1299
    //   615: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   618: ifeq +40 -> 658
    //   621: ldc -72
    //   623: iconst_2
    //   624: new 186	java/lang/StringBuilder
    //   627: dup
    //   628: ldc_w 301
    //   631: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   634: iload 6
    //   636: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   639: ldc_w 303
    //   642: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   645: aload_0
    //   646: getfield 86	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playSamplerate	I
    //   649: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   652: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   655: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   658: aload_0
    //   659: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   662: invokevirtual 266	android/media/AudioTrack:release	()V
    //   665: aload_0
    //   666: aconst_null
    //   667: putfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   670: iload 4
    //   672: iconst_1
    //   673: iadd
    //   674: istore 4
    //   676: goto -158 -> 518
    //   679: astore 10
    //   681: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   684: ifeq -558 -> 126
    //   687: ldc -72
    //   689: iconst_2
    //   690: new 186	java/lang/StringBuilder
    //   693: dup
    //   694: ldc_w 481
    //   697: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   700: aload 10
    //   702: invokevirtual 223	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   705: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   708: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   711: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   714: goto -588 -> 126
    //   717: astore 10
    //   719: iconst_0
    //   720: istore_1
    //   721: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   724: ifeq +30 -> 754
    //   727: ldc -72
    //   729: iconst_2
    //   730: new 186	java/lang/StringBuilder
    //   733: dup
    //   734: ldc_w 419
    //   737: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   740: aload 10
    //   742: invokevirtual 223	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   745: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   748: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   751: invokestatic 251	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   754: aload_0
    //   755: getfield 109	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   758: invokevirtual 434	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   761: iload_1
    //   762: ireturn
    //   763: aload_0
    //   764: getfield 104	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   767: ifnonnull +26 -> 793
    //   770: aload_0
    //   771: getfield 96	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_context	Landroid/content/Context;
    //   774: ifnull +19 -> 793
    //   777: aload_0
    //   778: aload_0
    //   779: getfield 96	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_context	Landroid/content/Context;
    //   782: ldc -29
    //   784: invokevirtual 233	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   787: checkcast 235	android/media/AudioManager
    //   790: putfield 104	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   793: aload_0
    //   794: getfield 104	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   797: invokevirtual 278	android/media/AudioManager:getMode	()I
    //   800: ifne +57 -> 857
    //   803: aload_0
    //   804: getfield 139	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_connectedDev	Ljava/lang/String;
    //   807: ldc_w 280
    //   810: invokevirtual 286	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   813: ifeq +44 -> 857
    //   816: aload_0
    //   817: iconst_3
    //   818: putfield 84	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   821: aload_0
    //   822: getfield 84	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   825: aload_0
    //   826: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   829: invokevirtual 338	android/media/AudioTrack:getStreamType	()I
    //   832: if_icmpne +33 -> 865
    //   835: iconst_0
    //   836: istore_2
    //   837: aload_0
    //   838: iconst_0
    //   839: putfield 141	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRouteChanged	Z
    //   842: goto -672 -> 170
    //   845: astore 10
    //   847: aload_0
    //   848: getfield 109	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   851: invokevirtual 434	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   854: aload 10
    //   856: athrow
    //   857: aload_0
    //   858: iconst_0
    //   859: putfield 84	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   862: goto -41 -> 821
    //   865: iconst_1
    //   866: istore_2
    //   867: goto -30 -> 837
    //   870: astore 10
    //   872: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   875: ifeq -504 -> 371
    //   878: ldc -72
    //   880: iconst_2
    //   881: ldc_w 483
    //   884: invokestatic 251	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   887: goto -516 -> 371
    //   890: astore 11
    //   892: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   895: ifeq +40 -> 935
    //   898: ldc -72
    //   900: iconst_2
    //   901: new 186	java/lang/StringBuilder
    //   904: dup
    //   905: invokespecial 306	java/lang/StringBuilder:<init>	()V
    //   908: aload 11
    //   910: invokevirtual 223	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   913: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   916: ldc_w 308
    //   919: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   922: aload_0
    //   923: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   926: invokevirtual 311	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   929: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   932: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   935: aload_0
    //   936: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   939: ifnull +10 -> 949
    //   942: aload_0
    //   943: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   946: invokevirtual 266	android/media/AudioTrack:release	()V
    //   949: aload_0
    //   950: aconst_null
    //   951: putfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   954: goto -284 -> 670
    //   957: aload_0
    //   958: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   961: astore 10
    //   963: aload 10
    //   965: ifnull +57 -> 1022
    //   968: aload_0
    //   969: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   972: invokevirtual 486	android/media/AudioTrack:play	()V
    //   975: aload_0
    //   976: getfield 135	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_as	Lcom/tencent/rtmp/sharp/jni/TraeAudioSession;
    //   979: aload_0
    //   980: getfield 104	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   983: invokevirtual 278	android/media/AudioManager:getMode	()I
    //   986: aload_0
    //   987: getfield 84	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_streamType	I
    //   990: invokevirtual 318	com/tencent/rtmp/sharp/jni/TraeAudioSession:voiceCallAudioParamChanged	(II)I
    //   993: pop
    //   994: aload_0
    //   995: getfield 104	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   998: astore 10
    //   1000: aload_0
    //   1001: getfield 139	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_connectedDev	Ljava/lang/String;
    //   1004: ldc_w 331
    //   1007: invokevirtual 286	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1010: ifeq +65 -> 1075
    //   1013: bipush 6
    //   1015: istore_2
    //   1016: aload 10
    //   1018: iload_2
    //   1019: invokestatic 335	com/tencent/rtmp/sharp/jni/TraeAudioManager:forceVolumeControlStream	(Landroid/media/AudioManager;I)V
    //   1022: iload_1
    //   1023: istore_2
    //   1024: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   1027: ifeq +39 -> 1066
    //   1030: ldc -72
    //   1032: iconst_2
    //   1033: new 186	java/lang/StringBuilder
    //   1036: dup
    //   1037: ldc_w 488
    //   1040: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1043: invokestatic 460	android/os/SystemClock:elapsedRealtime	()J
    //   1046: lload 8
    //   1048: lsub
    //   1049: invokevirtual 491	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1052: ldc_w 493
    //   1055: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1058: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1061: invokestatic 251	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   1064: iload_1
    //   1065: istore_2
    //   1066: aload_0
    //   1067: getfield 109	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   1070: invokevirtual 434	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   1073: iload_2
    //   1074: ireturn
    //   1075: aload_0
    //   1076: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   1079: invokevirtual 338	android/media/AudioTrack:getStreamType	()I
    //   1082: istore_2
    //   1083: goto -67 -> 1016
    //   1086: aload_0
    //   1087: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   1090: aload_0
    //   1091: getfield 169	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_tempBufPlay	[B
    //   1094: iconst_0
    //   1095: iload_1
    //   1096: invokevirtual 496	android/media/AudioTrack:write	([BII)I
    //   1099: istore_2
    //   1100: aload_0
    //   1101: getfield 165	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playBuffer	Ljava/nio/ByteBuffer;
    //   1104: invokevirtual 454	java/nio/ByteBuffer:rewind	()Ljava/nio/Buffer;
    //   1107: pop
    //   1108: iload_2
    //   1109: ifge +57 -> 1166
    //   1112: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   1115: ifeq +42 -> 1157
    //   1118: ldc -72
    //   1120: iconst_2
    //   1121: new 186	java/lang/StringBuilder
    //   1124: dup
    //   1125: ldc_w 498
    //   1128: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1131: iload_2
    //   1132: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1135: ldc_w 500
    //   1138: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1141: iload_1
    //   1142: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1145: ldc_w 502
    //   1148: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1151: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1154: invokestatic 251	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   1157: aload_0
    //   1158: getfield 109	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   1161: invokevirtual 434	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   1164: iconst_m1
    //   1165: ireturn
    //   1166: iload_2
    //   1167: iload_1
    //   1168: if_icmpeq +48 -> 1216
    //   1171: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   1174: ifeq +42 -> 1216
    //   1177: ldc -72
    //   1179: iconst_2
    //   1180: new 186	java/lang/StringBuilder
    //   1183: dup
    //   1184: ldc_w 504
    //   1187: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1190: iload_2
    //   1191: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1194: ldc_w 500
    //   1197: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1200: iload_1
    //   1201: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1204: ldc_w 502
    //   1207: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1210: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1213: invokestatic 251	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   1216: aload_0
    //   1217: aload_0
    //   1218: getfield 123	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_bufferedPlaySamples	I
    //   1221: iload_2
    //   1222: iconst_1
    //   1223: ishr
    //   1224: iadd
    //   1225: putfield 123	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_bufferedPlaySamples	I
    //   1228: aload_0
    //   1229: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   1232: invokevirtual 321	android/media/AudioTrack:getPlaybackHeadPosition	()I
    //   1235: istore_1
    //   1236: iload_1
    //   1237: aload_0
    //   1238: getfield 125	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playPosition	I
    //   1241: if_icmpge +8 -> 1249
    //   1244: aload_0
    //   1245: iconst_0
    //   1246: putfield 125	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playPosition	I
    //   1249: aload_0
    //   1250: aload_0
    //   1251: getfield 123	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_bufferedPlaySamples	I
    //   1254: iload_1
    //   1255: aload_0
    //   1256: getfield 125	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playPosition	I
    //   1259: isub
    //   1260: isub
    //   1261: putfield 123	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_bufferedPlaySamples	I
    //   1264: aload_0
    //   1265: iload_1
    //   1266: putfield 125	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playPosition	I
    //   1269: goto -203 -> 1066
    //   1272: astore 10
    //   1274: iload_2
    //   1275: istore_1
    //   1276: goto -555 -> 721
    //   1279: astore 10
    //   1281: goto -259 -> 1022
    //   1284: astore 10
    //   1286: goto -1125 -> 161
    //   1289: iconst_0
    //   1290: istore_3
    //   1291: goto -842 -> 449
    //   1294: astore 10
    //   1296: goto -575 -> 721
    //   1299: iload_3
    //   1300: iconst_1
    //   1301: iadd
    //   1302: istore_3
    //   1303: goto -854 -> 449
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1306	0	this	AudioDeviceInterface
    //   0	1306	1	paramInt	int
    //   8	1267	2	i	int
    //   17	1286	3	j	int
    //   516	159	4	k	int
    //   383	146	5	m	int
    //   529	106	6	n	int
    //   113	6	7	bool	boolean
    //   197	850	8	l	long
    //   92	371	10	localObject1	Object
    //   679	22	10	localException1	Exception
    //   717	24	10	localException2	Exception
    //   845	10	10	localObject2	Object
    //   870	1	10	localIllegalStateException	IllegalStateException
    //   961	56	10	localObject3	Object
    //   1272	1	10	localException3	Exception
    //   1279	1	10	localException4	Exception
    //   1284	1	10	localIOException	java.io.IOException
    //   1294	1	10	localException5	Exception
    //   890	19	11	localException6	Exception
    // Exception table:
    //   from	to	target	type
    //   121	126	679	java/lang/Exception
    //   88	94	717	java/lang/Exception
    //   109	115	717	java/lang/Exception
    //   126	131	717	java/lang/Exception
    //   131	143	717	java/lang/Exception
    //   148	161	717	java/lang/Exception
    //   161	168	717	java/lang/Exception
    //   170	182	717	java/lang/Exception
    //   681	714	717	java/lang/Exception
    //   763	793	717	java/lang/Exception
    //   793	821	717	java/lang/Exception
    //   821	835	717	java/lang/Exception
    //   837	842	717	java/lang/Exception
    //   857	862	717	java/lang/Exception
    //   1086	1100	717	java/lang/Exception
    //   88	94	845	finally
    //   109	115	845	finally
    //   121	126	845	finally
    //   126	131	845	finally
    //   131	143	845	finally
    //   148	161	845	finally
    //   161	168	845	finally
    //   170	182	845	finally
    //   186	247	845	finally
    //   247	255	845	finally
    //   260	275	845	finally
    //   275	324	845	finally
    //   324	366	845	finally
    //   366	371	845	finally
    //   371	442	845	finally
    //   454	515	845	finally
    //   545	572	845	finally
    //   572	604	845	finally
    //   604	658	845	finally
    //   658	670	845	finally
    //   681	714	845	finally
    //   721	754	845	finally
    //   763	793	845	finally
    //   793	821	845	finally
    //   821	835	845	finally
    //   837	842	845	finally
    //   857	862	845	finally
    //   872	887	845	finally
    //   892	935	845	finally
    //   935	949	845	finally
    //   949	954	845	finally
    //   957	963	845	finally
    //   968	1013	845	finally
    //   1016	1022	845	finally
    //   1024	1064	845	finally
    //   1075	1083	845	finally
    //   1086	1100	845	finally
    //   1100	1108	845	finally
    //   1112	1157	845	finally
    //   1171	1216	845	finally
    //   1216	1249	845	finally
    //   1249	1269	845	finally
    //   260	275	870	java/lang/IllegalStateException
    //   275	324	870	java/lang/IllegalStateException
    //   324	366	870	java/lang/IllegalStateException
    //   366	371	870	java/lang/IllegalStateException
    //   545	572	890	java/lang/Exception
    //   1100	1108	1272	java/lang/Exception
    //   1112	1157	1272	java/lang/Exception
    //   1171	1216	1272	java/lang/Exception
    //   1216	1249	1272	java/lang/Exception
    //   1249	1269	1272	java/lang/Exception
    //   968	1013	1279	java/lang/Exception
    //   1016	1022	1279	java/lang/Exception
    //   1075	1083	1279	java/lang/Exception
    //   148	161	1284	java/io/IOException
    //   186	247	1294	java/lang/Exception
    //   247	255	1294	java/lang/Exception
    //   260	275	1294	java/lang/Exception
    //   275	324	1294	java/lang/Exception
    //   324	366	1294	java/lang/Exception
    //   366	371	1294	java/lang/Exception
    //   371	442	1294	java/lang/Exception
    //   454	515	1294	java/lang/Exception
    //   572	604	1294	java/lang/Exception
    //   604	658	1294	java/lang/Exception
    //   658	670	1294	java/lang/Exception
    //   872	887	1294	java/lang/Exception
    //   892	935	1294	java/lang/Exception
    //   935	949	1294	java/lang/Exception
    //   949	954	1294	java/lang/Exception
    //   957	963	1294	java/lang/Exception
    //   1024	1064	1294	java/lang/Exception
  }
  
  /* Error */
  private int RecordAudio(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 117	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_isRecording	Z
    //   4: ifne +37 -> 41
    //   7: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   10: ifeq +29 -> 39
    //   13: ldc -72
    //   15: iconst_2
    //   16: new 186	java/lang/StringBuilder
    //   19: dup
    //   20: ldc_w 507
    //   23: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   26: aload_0
    //   27: getfield 117	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_isRecording	Z
    //   30: invokevirtual 248	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   33: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   36: invokestatic 251	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   39: iconst_m1
    //   40: ireturn
    //   41: aload_0
    //   42: getfield 111	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   45: invokevirtual 431	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   48: aload_0
    //   49: getfield 82	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   52: astore 4
    //   54: aload 4
    //   56: ifnonnull +13 -> 69
    //   59: aload_0
    //   60: getfield 111	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   63: invokevirtual 434	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   66: bipush -2
    //   68: ireturn
    //   69: aload_0
    //   70: getfield 115	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_doRecInit	Z
    //   73: istore_3
    //   74: iload_3
    //   75: iconst_1
    //   76: if_icmpne +13 -> 89
    //   79: bipush -19
    //   81: invokestatic 440	android/os/Process:setThreadPriority	(I)V
    //   84: aload_0
    //   85: iconst_0
    //   86: putfield 115	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_doRecInit	Z
    //   89: aload_0
    //   90: getfield 167	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_recBuffer	Ljava/nio/ByteBuffer;
    //   93: invokevirtual 454	java/nio/ByteBuffer:rewind	()Ljava/nio/Buffer;
    //   96: pop
    //   97: aload_0
    //   98: getfield 82	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   101: aload_0
    //   102: getfield 171	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_tempBufRec	[B
    //   105: iconst_0
    //   106: iload_1
    //   107: invokevirtual 510	android/media/AudioRecord:read	([BII)I
    //   110: istore_2
    //   111: iload_2
    //   112: ifge +141 -> 253
    //   115: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   118: ifeq +42 -> 160
    //   121: ldc -72
    //   123: iconst_2
    //   124: new 186	java/lang/StringBuilder
    //   127: dup
    //   128: ldc_w 512
    //   131: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   134: iload_2
    //   135: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   138: ldc_w 500
    //   141: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: iload_1
    //   145: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   148: ldc_w 502
    //   151: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   157: invokestatic 251	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   160: aload_0
    //   161: getfield 111	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   164: invokevirtual 434	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   167: iconst_m1
    //   168: ireturn
    //   169: astore 4
    //   171: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   174: ifeq -90 -> 84
    //   177: ldc -72
    //   179: iconst_2
    //   180: new 186	java/lang/StringBuilder
    //   183: dup
    //   184: ldc_w 514
    //   187: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   190: aload 4
    //   192: invokevirtual 223	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   195: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   201: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   204: goto -120 -> 84
    //   207: astore 4
    //   209: iconst_0
    //   210: istore_2
    //   211: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   214: ifeq +30 -> 244
    //   217: ldc -72
    //   219: iconst_2
    //   220: new 186	java/lang/StringBuilder
    //   223: dup
    //   224: ldc_w 516
    //   227: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   230: aload 4
    //   232: invokevirtual 223	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   235: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   241: invokestatic 251	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   244: aload_0
    //   245: getfield 111	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   248: invokevirtual 434	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   251: iload_2
    //   252: ireturn
    //   253: aload_0
    //   254: getfield 167	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_recBuffer	Ljava/nio/ByteBuffer;
    //   257: aload_0
    //   258: getfield 171	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_tempBufRec	[B
    //   261: iconst_0
    //   262: iload_2
    //   263: invokevirtual 520	java/nio/ByteBuffer:put	([BII)Ljava/nio/ByteBuffer;
    //   266: pop
    //   267: getstatic 70	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_dumpEnable	Z
    //   270: ifeq +27 -> 297
    //   273: aload_0
    //   274: getfield 131	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_rec_out	Ljava/io/FileOutputStream;
    //   277: astore 4
    //   279: aload 4
    //   281: ifnull +16 -> 297
    //   284: aload_0
    //   285: getfield 131	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_rec_out	Ljava/io/FileOutputStream;
    //   288: aload_0
    //   289: getfield 171	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_tempBufRec	[B
    //   292: iconst_0
    //   293: iload_2
    //   294: invokevirtual 446	java/io/FileOutputStream:write	([BII)V
    //   297: iload_2
    //   298: iload_1
    //   299: if_icmpeq +57 -> 356
    //   302: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   305: ifeq +42 -> 347
    //   308: ldc -72
    //   310: iconst_2
    //   311: new 186	java/lang/StringBuilder
    //   314: dup
    //   315: ldc_w 522
    //   318: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   321: iload_2
    //   322: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   325: ldc_w 500
    //   328: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   331: iload_1
    //   332: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   335: ldc_w 502
    //   338: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   341: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   344: invokestatic 251	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   347: aload_0
    //   348: getfield 111	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   351: invokevirtual 434	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   354: iconst_m1
    //   355: ireturn
    //   356: aload_0
    //   357: getfield 111	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   360: invokevirtual 434	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   363: iload_2
    //   364: ireturn
    //   365: astore 4
    //   367: aload_0
    //   368: getfield 111	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   371: invokevirtual 434	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   374: aload 4
    //   376: athrow
    //   377: astore 4
    //   379: goto -168 -> 211
    //   382: astore 4
    //   384: goto -87 -> 297
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	387	0	this	AudioDeviceInterface
    //   0	387	1	paramInt	int
    //   110	254	2	i	int
    //   73	4	3	bool	boolean
    //   52	3	4	localAudioRecord	AudioRecord
    //   169	22	4	localException1	Exception
    //   207	24	4	localException2	Exception
    //   277	3	4	localFileOutputStream	FileOutputStream
    //   365	10	4	localObject	Object
    //   377	1	4	localException3	Exception
    //   382	1	4	localIOException	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   79	84	169	java/lang/Exception
    //   48	54	207	java/lang/Exception
    //   69	74	207	java/lang/Exception
    //   84	89	207	java/lang/Exception
    //   89	111	207	java/lang/Exception
    //   171	204	207	java/lang/Exception
    //   48	54	365	finally
    //   69	74	365	finally
    //   79	84	365	finally
    //   84	89	365	finally
    //   89	111	365	finally
    //   115	160	365	finally
    //   171	204	365	finally
    //   211	244	365	finally
    //   253	279	365	finally
    //   284	297	365	finally
    //   302	347	365	finally
    //   115	160	377	java/lang/Exception
    //   253	279	377	java/lang/Exception
    //   284	297	377	java/lang/Exception
    //   302	347	377	java/lang/Exception
    //   284	297	382	java/io/IOException
  }
  
  private int SetPlayoutVolume(int paramInt)
  {
    if ((this._audioManager == null) && (this._context != null)) {
      this._audioManager = ((AudioManager)this._context.getSystemService("audio"));
    }
    int i = -1;
    if (this._audioManager != null)
    {
      this._audioManager.setStreamVolume(0, paramInt, 0);
      i = 0;
    }
    return i;
  }
  
  /* Error */
  private int StartPlayback()
  {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_1
    //   2: aload_0
    //   3: getfield 119	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_isPlaying	Z
    //   6: ifeq +20 -> 26
    //   9: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   12: ifeq +12 -> 24
    //   15: ldc -72
    //   17: iconst_2
    //   18: ldc_w 532
    //   21: invokestatic 251	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   24: iconst_m1
    //   25: ireturn
    //   26: aload_0
    //   27: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   30: ifnonnull +37 -> 67
    //   33: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   36: ifeq -12 -> 24
    //   39: ldc -72
    //   41: iconst_2
    //   42: new 186	java/lang/StringBuilder
    //   45: dup
    //   46: ldc_w 534
    //   49: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   52: aload_0
    //   53: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   56: invokevirtual 311	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   59: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   62: invokestatic 251	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   65: iconst_m1
    //   66: ireturn
    //   67: aload_0
    //   68: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   71: invokevirtual 486	android/media/AudioTrack:play	()V
    //   74: getstatic 70	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_dumpEnable	Z
    //   77: ifeq +52 -> 129
    //   80: aload_0
    //   81: getfield 104	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   84: ifnull +11 -> 95
    //   87: aload_0
    //   88: getfield 104	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   91: invokevirtual 278	android/media/AudioManager:getMode	()I
    //   94: istore_1
    //   95: aload_0
    //   96: new 536	java/io/File
    //   99: dup
    //   100: aload_0
    //   101: ldc_w 538
    //   104: iload_1
    //   105: invokespecial 542	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:getDumpFilePath	(Ljava/lang/String;I)Ljava/lang/String;
    //   108: invokespecial 543	java/io/File:<init>	(Ljava/lang/String;)V
    //   111: putfield 129	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_play_dump	Ljava/io/File;
    //   114: aload_0
    //   115: new 442	java/io/FileOutputStream
    //   118: dup
    //   119: aload_0
    //   120: getfield 129	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_play_dump	Ljava/io/File;
    //   123: invokespecial 546	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   126: putfield 133	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_play_out	Ljava/io/FileOutputStream;
    //   129: aload_0
    //   130: iconst_1
    //   131: putfield 119	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_isPlaying	Z
    //   134: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   137: ifeq +12 -> 149
    //   140: ldc -72
    //   142: iconst_2
    //   143: ldc_w 548
    //   146: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   149: iconst_0
    //   150: ireturn
    //   151: astore_2
    //   152: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   155: ifeq -131 -> 24
    //   158: ldc -72
    //   160: iconst_2
    //   161: ldc_w 550
    //   164: invokestatic 251	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   167: iconst_m1
    //   168: ireturn
    //   169: astore_2
    //   170: goto -41 -> 129
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	173	0	this	AudioDeviceInterface
    //   1	104	1	i	int
    //   151	1	2	localIllegalStateException	IllegalStateException
    //   169	1	2	localFileNotFoundException	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   67	74	151	java/lang/IllegalStateException
    //   114	129	169	java/io/FileNotFoundException
  }
  
  /* Error */
  private int StartRecording()
  {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_1
    //   2: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   5: ifeq +12 -> 17
    //   8: ldc -72
    //   10: iconst_2
    //   11: ldc_w 553
    //   14: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   17: aload_0
    //   18: getfield 117	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_isRecording	Z
    //   21: ifeq +37 -> 58
    //   24: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   27: ifeq +29 -> 56
    //   30: ldc -72
    //   32: iconst_2
    //   33: new 186	java/lang/StringBuilder
    //   36: dup
    //   37: ldc_w 555
    //   40: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   43: aload_0
    //   44: getfield 117	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_isRecording	Z
    //   47: invokevirtual 248	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   50: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   53: invokestatic 251	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   56: iconst_m1
    //   57: ireturn
    //   58: aload_0
    //   59: getfield 82	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   62: ifnonnull +37 -> 99
    //   65: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   68: ifeq -12 -> 56
    //   71: ldc -72
    //   73: iconst_2
    //   74: new 186	java/lang/StringBuilder
    //   77: dup
    //   78: ldc_w 557
    //   81: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   84: aload_0
    //   85: getfield 82	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   88: invokevirtual 311	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   91: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   94: invokestatic 251	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   97: iconst_m1
    //   98: ireturn
    //   99: aload_0
    //   100: getfield 82	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   103: invokevirtual 560	android/media/AudioRecord:startRecording	()V
    //   106: getstatic 70	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_dumpEnable	Z
    //   109: ifeq +52 -> 161
    //   112: aload_0
    //   113: getfield 104	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   116: ifnull +11 -> 127
    //   119: aload_0
    //   120: getfield 104	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioManager	Landroid/media/AudioManager;
    //   123: invokevirtual 278	android/media/AudioManager:getMode	()I
    //   126: istore_1
    //   127: aload_0
    //   128: new 536	java/io/File
    //   131: dup
    //   132: aload_0
    //   133: ldc_w 562
    //   136: iload_1
    //   137: invokespecial 542	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:getDumpFilePath	(Ljava/lang/String;I)Ljava/lang/String;
    //   140: invokespecial 543	java/io/File:<init>	(Ljava/lang/String;)V
    //   143: putfield 127	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_rec_dump	Ljava/io/File;
    //   146: aload_0
    //   147: new 442	java/io/FileOutputStream
    //   150: dup
    //   151: aload_0
    //   152: getfield 127	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_rec_dump	Ljava/io/File;
    //   155: invokespecial 546	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   158: putfield 131	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_rec_out	Ljava/io/FileOutputStream;
    //   161: aload_0
    //   162: iconst_1
    //   163: putfield 117	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_isRecording	Z
    //   166: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   169: ifeq +12 -> 181
    //   172: ldc -72
    //   174: iconst_2
    //   175: ldc_w 564
    //   178: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   181: iconst_0
    //   182: ireturn
    //   183: astore_2
    //   184: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   187: ifeq -131 -> 56
    //   190: ldc -72
    //   192: iconst_2
    //   193: ldc_w 566
    //   196: invokestatic 251	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   199: iconst_m1
    //   200: ireturn
    //   201: astore_2
    //   202: goto -41 -> 161
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	205	0	this	AudioDeviceInterface
    //   1	136	1	i	int
    //   183	1	2	localIllegalStateException	IllegalStateException
    //   201	1	2	localFileNotFoundException	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   99	106	183	java/lang/IllegalStateException
    //   146	161	201	java/io/FileNotFoundException
  }
  
  /* Error */
  private int StopPlayback()
  {
    // Byte code:
    //   0: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   3: ifeq +29 -> 32
    //   6: ldc -72
    //   8: iconst_2
    //   9: new 186	java/lang/StringBuilder
    //   12: dup
    //   13: ldc_w 569
    //   16: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   19: aload_0
    //   20: getfield 119	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_isPlaying	Z
    //   23: invokevirtual 248	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   26: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   29: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   32: aload_0
    //   33: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   36: ifnonnull +50 -> 86
    //   39: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   42: ifeq +42 -> 84
    //   45: ldc -72
    //   47: iconst_2
    //   48: new 186	java/lang/StringBuilder
    //   51: dup
    //   52: ldc_w 571
    //   55: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   58: aload_0
    //   59: getfield 119	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_isPlaying	Z
    //   62: invokevirtual 248	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   65: ldc_w 428
    //   68: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: aload_0
    //   72: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   75: invokevirtual 311	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   78: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   81: invokestatic 251	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   84: iconst_m1
    //   85: ireturn
    //   86: aload_0
    //   87: getfield 109	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   90: invokevirtual 431	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   93: aload_0
    //   94: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   97: invokevirtual 467	android/media/AudioTrack:getPlayState	()I
    //   100: istore_1
    //   101: iload_1
    //   102: iconst_3
    //   103: if_icmpne +67 -> 170
    //   106: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   109: ifeq +12 -> 121
    //   112: ldc -72
    //   114: iconst_2
    //   115: ldc_w 469
    //   118: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   121: aload_0
    //   122: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   125: invokevirtual 472	android/media/AudioTrack:stop	()V
    //   128: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   131: ifeq +32 -> 163
    //   134: ldc -72
    //   136: iconst_2
    //   137: new 186	java/lang/StringBuilder
    //   140: dup
    //   141: ldc_w 477
    //   144: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   147: aload_0
    //   148: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   151: invokevirtual 467	android/media/AudioTrack:getPlayState	()I
    //   154: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   157: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   160: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   163: aload_0
    //   164: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   167: invokevirtual 475	android/media/AudioTrack:flush	()V
    //   170: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   173: ifeq +32 -> 205
    //   176: ldc -72
    //   178: iconst_2
    //   179: new 186	java/lang/StringBuilder
    //   182: dup
    //   183: ldc_w 479
    //   186: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   189: aload_0
    //   190: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   193: invokevirtual 467	android/media/AudioTrack:getPlayState	()I
    //   196: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   199: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   202: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   205: aload_0
    //   206: getfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   209: invokevirtual 266	android/media/AudioTrack:release	()V
    //   212: aload_0
    //   213: aconst_null
    //   214: putfield 80	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioTrack	Landroid/media/AudioTrack;
    //   217: aload_0
    //   218: iconst_0
    //   219: putfield 119	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_isPlaying	Z
    //   222: aload_0
    //   223: getfield 109	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   226: invokevirtual 434	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   229: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   232: ifeq +12 -> 244
    //   235: ldc -72
    //   237: iconst_2
    //   238: ldc_w 573
    //   241: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   244: iconst_0
    //   245: ireturn
    //   246: astore_2
    //   247: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   250: ifeq +12 -> 262
    //   253: ldc -72
    //   255: iconst_2
    //   256: ldc_w 483
    //   259: invokestatic 251	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   262: aload_0
    //   263: getfield 109	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   266: invokevirtual 434	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   269: iconst_m1
    //   270: ireturn
    //   271: astore_2
    //   272: aload_0
    //   273: getfield 109	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_playLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   276: invokevirtual 434	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   279: aload_2
    //   280: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	281	0	this	AudioDeviceInterface
    //   100	4	1	i	int
    //   246	1	2	localIllegalStateException	IllegalStateException
    //   271	9	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   106	121	246	java/lang/IllegalStateException
    //   121	128	246	java/lang/IllegalStateException
    //   93	101	271	finally
    //   106	121	271	finally
    //   121	128	271	finally
    //   128	163	271	finally
    //   163	170	271	finally
    //   170	205	271	finally
    //   205	222	271	finally
    //   247	262	271	finally
  }
  
  /* Error */
  private int StopRecording()
  {
    // Byte code:
    //   0: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   3: ifeq +12 -> 15
    //   6: ldc -72
    //   8: iconst_2
    //   9: ldc_w 576
    //   12: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   15: aload_0
    //   16: getfield 82	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   19: ifnonnull +37 -> 56
    //   22: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   25: ifeq +29 -> 54
    //   28: ldc -72
    //   30: iconst_2
    //   31: new 186	java/lang/StringBuilder
    //   34: dup
    //   35: ldc_w 578
    //   38: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   41: aload_0
    //   42: getfield 82	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   45: invokevirtual 311	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   48: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   51: invokestatic 251	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   54: iconst_m1
    //   55: ireturn
    //   56: aload_0
    //   57: getfield 111	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   60: invokevirtual 431	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   63: aload_0
    //   64: getfield 82	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   67: invokevirtual 581	android/media/AudioRecord:getRecordingState	()I
    //   70: istore_1
    //   71: iload_1
    //   72: iconst_3
    //   73: if_icmpne +45 -> 118
    //   76: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   79: ifeq +32 -> 111
    //   82: ldc -72
    //   84: iconst_2
    //   85: new 186	java/lang/StringBuilder
    //   88: dup
    //   89: ldc_w 583
    //   92: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   95: aload_0
    //   96: getfield 82	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   99: invokevirtual 581	android/media/AudioRecord:getRecordingState	()I
    //   102: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   105: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   108: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   111: aload_0
    //   112: getfield 82	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   115: invokevirtual 584	android/media/AudioRecord:stop	()V
    //   118: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   121: ifeq +32 -> 153
    //   124: ldc -72
    //   126: iconst_2
    //   127: new 186	java/lang/StringBuilder
    //   130: dup
    //   131: ldc_w 586
    //   134: invokespecial 191	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   137: aload_0
    //   138: getfield 82	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   141: invokevirtual 581	android/media/AudioRecord:getRecordingState	()I
    //   144: invokevirtual 195	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   147: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   150: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   153: aload_0
    //   154: getfield 82	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   157: invokevirtual 361	android/media/AudioRecord:release	()V
    //   160: aload_0
    //   161: aconst_null
    //   162: putfield 82	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_audioRecord	Landroid/media/AudioRecord;
    //   165: aload_0
    //   166: iconst_0
    //   167: putfield 117	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_isRecording	Z
    //   170: aload_0
    //   171: getfield 111	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   174: invokevirtual 434	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   177: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   180: ifeq +12 -> 192
    //   183: ldc -72
    //   185: iconst_2
    //   186: ldc_w 588
    //   189: invokestatic 203	com/tencent/rtmp/sharp/jni/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   192: iconst_0
    //   193: ireturn
    //   194: astore_2
    //   195: invokestatic 182	com/tencent/rtmp/sharp/jni/QLog:isColorLevel	()Z
    //   198: ifeq +12 -> 210
    //   201: ldc -72
    //   203: iconst_2
    //   204: ldc_w 590
    //   207: invokestatic 251	com/tencent/rtmp/sharp/jni/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   210: aload_0
    //   211: getfield 111	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   214: invokevirtual 434	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   217: iconst_m1
    //   218: ireturn
    //   219: astore_2
    //   220: aload_0
    //   221: getfield 111	com/tencent/rtmp/sharp/jni/AudioDeviceInterface:_recLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   224: invokevirtual 434	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   227: aload_2
    //   228: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	229	0	this	AudioDeviceInterface
    //   70	4	1	i	int
    //   194	1	2	localIllegalStateException	IllegalStateException
    //   219	9	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   76	111	194	java/lang/IllegalStateException
    //   111	118	194	java/lang/IllegalStateException
    //   63	71	219	finally
    //   76	111	219	finally
    //   111	118	219	finally
    //   118	153	219	finally
    //   153	170	219	finally
    //   195	210	219	finally
  }
  
  private int getAndroidSdkVersion()
  {
    return Build.VERSION.SDK_INT;
  }
  
  @TargetApi(16)
  private int getAudioSessionId(AudioRecord paramAudioRecord)
  {
    return 0;
  }
  
  private String getDumpFilePath(String paramString, int paramInt)
  {
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 2, "manufacture:" + Build.MANUFACTURER);
    }
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 2, "MODEL:" + Build.MODEL);
    }
    paramString = Environment.getExternalStorageDirectory().getPath() + "/MF-" + Build.MANUFACTURER + "-M-" + Build.MODEL + "-as-" + TraeAudioManager.getAudioSource(this._audioSourcePolicy) + "-st-" + this._streamType + "-m-" + paramInt + "-" + paramString;
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 2, "dump:" + paramString);
    }
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 2, "dump replace:" + paramString.replace(" ", "_"));
    }
    return paramString.replace(" ", "_");
  }
  
  private int getLowlatencyFramesPerBuffer()
  {
    if ((this._context == null) || (Build.VERSION.SDK_INT < 9))
    {
      if (QLog.isColorLevel()) {
        QLog.e("TRAE", 2, "getLowlatencySamplerate err, _context:" + this._context + " api:" + Build.VERSION.SDK_INT);
      }
      return 0;
    }
    boolean bool = this._context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    StringBuilder localStringBuilder;
    if (QLog.isColorLevel())
    {
      localStringBuilder = new StringBuilder("LOW_LATENCY:");
      if (bool != true) {
        break label140;
      }
    }
    label140:
    for (String str = "Y";; str = "N")
    {
      QLog.w("TRAE", 2, str);
      if ((Build.VERSION.SDK_INT >= 17) || (!QLog.isColorLevel())) {
        break;
      }
      QLog.e("TRAE", 2, "API Level too low not support PROPERTY_OUTPUT_SAMPLE_RATE");
      return 0;
    }
  }
  
  private int getLowlatencySamplerate()
  {
    if ((this._context == null) || (Build.VERSION.SDK_INT < 9)) {
      if (QLog.isColorLevel()) {
        QLog.e("TRAE", 2, "getLowlatencySamplerate err, _context:" + this._context + " api:" + Build.VERSION.SDK_INT);
      }
    }
    label140:
    label147:
    do
    {
      return 0;
      boolean bool = this._context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
      StringBuilder localStringBuilder;
      if (QLog.isColorLevel())
      {
        localStringBuilder = new StringBuilder("LOW_LATENCY:");
        if (bool != true) {
          break label140;
        }
      }
      for (String str = "Y";; str = "N")
      {
        QLog.w("TRAE", 2, str);
        if (Build.VERSION.SDK_INT >= 17) {
          break label147;
        }
        if (!QLog.isColorLevel()) {
          break;
        }
        QLog.e("TRAE", 2, "API Level too low not support PROPERTY_OUTPUT_SAMPLE_RATE");
        return 0;
      }
    } while (!QLog.isColorLevel());
    QLog.e("TRAE", 2, "getLowlatencySamplerate not support right now!");
    return 0;
  }
  
  public static String getTraceInfo()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    StackTraceElement[] arrayOfStackTraceElement = new Throwable().getStackTrace();
    localStringBuffer.append(arrayOfStackTraceElement[2].getClassName()).append(".").append(arrayOfStackTraceElement[2].getMethodName()).append(": ").append(arrayOfStackTraceElement[2].getLineNumber());
    return localStringBuffer.toString();
  }
  
  private void initTRAEAudioManager()
  {
    if (this._context != null)
    {
      TraeAudioManager.init(this._context);
      if (this._init_as == null)
      {
        QLog.e("TRAE", 2, "TraeAudioSession-LeakCheck init: initTRAEAudioManager");
        this._init_as = new TraeAudioSession(this._context, null);
      }
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, "initTRAEAudioManager , TraeAudioSession startService");
      }
      this._init_as.startService("DEVICE_SPEAKERPHONE;DEVICE_WIREDHEADSET;DEVICE_BLUETOOTHHEADSET;");
    }
  }
  
  private void setAudioRouteSwitchState(String paramString)
  {
    if (paramString.equals("DEVICE_EARPHONE"))
    {
      this.switchState = 1;
      return;
    }
    if (paramString.equals("DEVICE_SPEAKERPHONE"))
    {
      this.switchState = 2;
      return;
    }
    if (paramString.equals("DEVICE_WIREDHEADSET"))
    {
      this.switchState = 3;
      return;
    }
    if (paramString.equals("DEVICE_BLUETOOTHHEADSET"))
    {
      this.switchState = 4;
      return;
    }
    this.switchState = 0;
  }
  
  private void uninitTRAEAudioManager()
  {
    if (this._context != null)
    {
      if (this._init_as != null)
      {
        if (QLog.isColorLevel()) {
          QLog.w("TRAE", 2, "uninitTRAEAudioManager , stopService");
        }
        this._init_as.stopService();
        this._init_as.release();
        this._init_as = null;
        QLog.e("TRAE", 2, "TraeAudioSession-LeakCheck release: uninitTRAEAudioManager");
      }
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, "uninitTRAEAudioManager , stopService");
      }
      TraeAudioManager.uninit();
    }
    while (!QLog.isColorLevel()) {
      return;
    }
    QLog.w("TRAE", 2, "uninitTRAEAudioManager , context null");
  }
  
  public int call_postprocess()
  {
    LogTraceEntry("");
    this.switchState = 0;
    if (this._as != null)
    {
      this._as.voiceCallPostprocess();
      this._as.release();
      this._as = null;
      QLog.e("TRAE", 2, "TraeAudioSession-LeakCheck release: call_postprocess");
    }
    TraeAudioManager.IsUpdateSceneFlag = false;
    LogTraceExit();
    return 0;
  }
  
  public int call_postprocess_media()
  {
    LogTraceEntry("");
    this.switchState = 0;
    if (this._as != null)
    {
      this._as.release();
      this._as = null;
      QLog.e("TRAE", 2, "TraeAudioSession-LeakCheck release: call_postprocess_media");
    }
    TraeAudioManager.IsUpdateSceneFlag = false;
    LogTraceExit();
    return 0;
  }
  
  public int call_preprocess()
  {
    LogTraceEntry("");
    this.switchState = 0;
    this._streamType = TraeAudioManager.getAudioStreamType(this._audioStreamTypePolicy);
    if (this._as == null) {
      QLog.e("TRAE", 2, "TraeAudioSession-LeakCheck init: call_preprocess");
    }
    this._as = new TraeAudioSession(this._context, new TraeAudioSession.ITraeAudioCallback()
    {
      public void onAudioRouteSwitchEnd(String paramAnonymousString, long paramAnonymousLong) {}
      
      public void onAudioRouteSwitchStart(String paramAnonymousString1, String paramAnonymousString2) {}
      
      public void onConnectDeviceRes(int paramAnonymousInt, String paramAnonymousString, boolean paramAnonymousBoolean) {}
      
      public void onDeviceChangabledUpdate(boolean paramAnonymousBoolean) {}
      
      public void onDeviceListUpdate(String[] paramAnonymousArrayOfString, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3)
      {
        if (AudioDeviceInterface.this.usingJava) {
          AudioDeviceInterface.this.onOutputChanage(paramAnonymousString1);
        }
      }
      
      public void onGetConnectedDeviceRes(int paramAnonymousInt, String paramAnonymousString)
      {
        if (paramAnonymousInt == 0) {
          AudioDeviceInterface.this.onOutputChanage(paramAnonymousString);
        }
      }
      
      public void onGetConnectingDeviceRes(int paramAnonymousInt, String paramAnonymousString) {}
      
      public void onGetDeviceListRes(int paramAnonymousInt, String[] paramAnonymousArrayOfString, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3) {}
      
      public void onGetStreamTypeRes(int paramAnonymousInt1, int paramAnonymousInt2) {}
      
      public void onIsDeviceChangabledRes(int paramAnonymousInt, boolean paramAnonymousBoolean) {}
      
      public void onRingCompletion(int paramAnonymousInt, String paramAnonymousString) {}
      
      public void onServiceStateUpdate(boolean paramAnonymousBoolean)
      {
        if (!paramAnonymousBoolean) {}
        try
        {
          AudioDeviceInterface.this._prelock.lock();
          AudioDeviceInterface.this._preDone = true;
          if (QLog.isColorLevel()) {
            QLog.e("TRAE", 2, "onVoicecallPreprocessRes signalAll");
          }
          AudioDeviceInterface.this._precon.signalAll();
          AudioDeviceInterface.this._prelock.unlock();
          return;
        }
        catch (Exception localException) {}
      }
      
      public void onStreamTypeUpdate(int paramAnonymousInt) {}
      
      public void onVoicecallPreprocessRes(int paramAnonymousInt)
      {
        try
        {
          AudioDeviceInterface.this._prelock.lock();
          AudioDeviceInterface.this._preDone = true;
          if (QLog.isColorLevel()) {
            QLog.e("TRAE", 2, "onVoicecallPreprocessRes signalAll");
          }
          AudioDeviceInterface.this._precon.signalAll();
          AudioDeviceInterface.this._prelock.unlock();
          return;
        }
        catch (Exception localException) {}
      }
    });
    this._preDone = false;
    if (this._as != null) {
      this._prelock.lock();
    }
    int i;
    int j;
    label222:
    for (;;)
    {
      try
      {
        this._as.voiceCallPreprocess(this._modePolicy, this._streamType);
        this._as.connectHighestPriorityDevice();
        i = 7;
        j = i - 1;
        if (i <= 0) {}
      }
      finally
      {
        this._prelock.unlock();
      }
      try
      {
        if (!this._preDone)
        {
          this._precon.await(1L, TimeUnit.SECONDS);
          if (!QLog.isColorLevel()) {
            break label222;
          }
          QLog.e("TRAE", 2, "call_preprocess waiting...  as:" + this._as);
          i = j;
          continue;
        }
        if (QLog.isColorLevel()) {
          QLog.e("TRAE", 2, "call_preprocess done!");
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        continue;
        i = j;
      }
      this._as.getConnectedDevice();
      this._prelock.unlock();
      LogTraceExit();
      return 0;
    }
  }
  
  public int call_preprocess_media()
  {
    LogTraceEntry("");
    this.switchState = 0;
    if (this._as == null) {
      QLog.e("TRAE", 2, "TraeAudioSession-LeakCheck init: call_preprocess_media");
    }
    this._as = new TraeAudioSession(this._context, new TraeAudioSession.ITraeAudioCallback()
    {
      public void onAudioRouteSwitchEnd(String paramAnonymousString, long paramAnonymousLong) {}
      
      public void onAudioRouteSwitchStart(String paramAnonymousString1, String paramAnonymousString2) {}
      
      public void onConnectDeviceRes(int paramAnonymousInt, String paramAnonymousString, boolean paramAnonymousBoolean) {}
      
      public void onDeviceChangabledUpdate(boolean paramAnonymousBoolean) {}
      
      public void onDeviceListUpdate(String[] paramAnonymousArrayOfString, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3)
      {
        if (AudioDeviceInterface.this.usingJava) {
          AudioDeviceInterface.this.onOutputChanage(paramAnonymousString1);
        }
      }
      
      public void onGetConnectedDeviceRes(int paramAnonymousInt, String paramAnonymousString)
      {
        if (paramAnonymousInt == 0) {
          AudioDeviceInterface.this.onOutputChanage(paramAnonymousString);
        }
      }
      
      public void onGetConnectingDeviceRes(int paramAnonymousInt, String paramAnonymousString) {}
      
      public void onGetDeviceListRes(int paramAnonymousInt, String[] paramAnonymousArrayOfString, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3) {}
      
      public void onGetStreamTypeRes(int paramAnonymousInt1, int paramAnonymousInt2) {}
      
      public void onIsDeviceChangabledRes(int paramAnonymousInt, boolean paramAnonymousBoolean) {}
      
      public void onRingCompletion(int paramAnonymousInt, String paramAnonymousString) {}
      
      public void onServiceStateUpdate(boolean paramAnonymousBoolean) {}
      
      public void onStreamTypeUpdate(int paramAnonymousInt) {}
      
      public void onVoicecallPreprocessRes(int paramAnonymousInt) {}
    });
    if (this._as != null) {}
    try
    {
      if (this._audioManager == null) {
        this._audioManager = ((AudioManager)this._context.getSystemService("audio"));
      }
      if (this._audioManager != null)
      {
        if (this._audioManager.getMode() == 2)
        {
          int i = 5;
          while ((i > 0) && (this._audioManager.getMode() == 2))
          {
            if (QLog.isColorLevel()) {
              QLog.e("TRAE", 2, "media call_preprocess waiting...  mode:" + this._audioManager.getMode());
            }
            Thread.sleep(500L);
            i -= 1;
          }
        }
        if (this._audioManager.getMode() != 0) {
          this._audioManager.setMode(0);
        }
      }
      this._as.connectHighestPriorityDevice();
      this._as.getConnectedDevice();
      if (QLog.isColorLevel()) {
        QLog.e("TRAE", 2, "call_preprocess done!");
      }
      LogTraceExit();
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
    return 0;
  }
  
  public int getAudioRouteSwitchState()
  {
    return this.switchState;
  }
  
  public void onOutputChanage(String paramString)
  {
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 2, " onOutputChanage:" + paramString);
    }
    setAudioRouteSwitchState(paramString);
    if (!TraeAudioManager.isCloseSystemAPM(this._modePolicy)) {}
    while ((this._sceneModeKey == 1) || (this._sceneModeKey == 2) || (this._sceneModeKey == 3)) {
      return;
    }
    this._connectedDev = paramString;
    Object localObject;
    if (QLog.isColorLevel())
    {
      StringBuilder localStringBuilder = new StringBuilder(" onOutputChanage:").append(paramString);
      if (this._audioManager != null) {
        break label253;
      }
      localObject = " am==null";
      localStringBuilder = localStringBuilder.append((String)localObject).append(" st:").append(this._streamType);
      if (this._audioTrack != null) {
        break label280;
      }
      localObject = "_audioTrack==null";
      label136:
      QLog.w("TRAE", 2, (String)localObject);
    }
    for (;;)
    {
      try
      {
        if (this._audioManager == null) {
          this._audioManager = ((AudioManager)this._context.getSystemService("audio"));
        }
        if (QLog.isColorLevel())
        {
          localObject = new StringBuilder(" curr mode:").append(paramString);
          if (this._audioManager != null) {
            continue;
          }
          paramString = "am==null";
          QLog.w("TRAE", 2, paramString);
        }
        if ((this._audioManager != null) && (this._connectedDev.equals("DEVICE_SPEAKERPHONE"))) {
          this._audioManager.setMode(0);
        }
      }
      catch (Exception paramString)
      {
        label253:
        label280:
        if (!QLog.isColorLevel()) {
          continue;
        }
        QLog.w("TRAE", 2, paramString.getMessage());
        continue;
      }
      this._audioRouteChanged = true;
      return;
      localObject = " mode:" + this._audioManager.getMode();
      break;
      localObject = " at.st:" + this._audioTrack.getStreamType();
      break label136;
      paramString = " mode:" + this._audioManager.getMode();
    }
  }
  
  public void setContext(Context paramContext)
  {
    this._context = paramContext;
  }
  
  public void setJavaInterface(int paramInt)
  {
    if (paramInt == 0) {}
    for (this.usingJava = false;; this.usingJava = true)
    {
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, "setJavaInterface flg:" + paramInt);
      }
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\rtmp\sharp\jni\AudioDeviceInterface.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */