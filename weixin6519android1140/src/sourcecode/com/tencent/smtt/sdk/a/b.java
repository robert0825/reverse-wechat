package com.tencent.smtt.sdk.a;

import MTT.ThirdAppInfoNew;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.t;
import com.tencent.smtt.utils.c;
import com.tencent.smtt.utils.p;
import com.tencent.smtt.utils.q;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public final class b
{
  public static byte[] xXY = null;
  
  static
  {
    try
    {
      xXY = "65dRa93L".getBytes("utf-8");
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException) {}
  }
  
  /* Error */
  public static org.json.JSONObject a(ThirdAppInfoNew paramThirdAppInfoNew, Context paramContext)
  {
    // Byte code:
    //   0: new 31	org/json/JSONObject
    //   3: dup
    //   4: invokespecial 34	org/json/JSONObject:<init>	()V
    //   7: astore_3
    //   8: aload_3
    //   9: ldc 36
    //   11: aload_0
    //   12: getfield 42	MTT/ThirdAppInfoNew:sAppName	Ljava/lang/String;
    //   15: invokevirtual 46	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   18: pop
    //   19: aload_3
    //   20: ldc 48
    //   22: aload_0
    //   23: getfield 51	MTT/ThirdAppInfoNew:sTime	Ljava/lang/String;
    //   26: invokevirtual 46	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   29: pop
    //   30: aload_3
    //   31: ldc 53
    //   33: aload_0
    //   34: getfield 56	MTT/ThirdAppInfoNew:sQua2	Ljava/lang/String;
    //   37: invokevirtual 46	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   40: pop
    //   41: aload_3
    //   42: ldc 58
    //   44: aload_0
    //   45: getfield 61	MTT/ThirdAppInfoNew:sLc	Ljava/lang/String;
    //   48: invokevirtual 46	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   51: pop
    //   52: aload_3
    //   53: ldc 63
    //   55: aload_0
    //   56: getfield 66	MTT/ThirdAppInfoNew:sGuid	Ljava/lang/String;
    //   59: invokevirtual 46	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   62: pop
    //   63: aload_3
    //   64: ldc 68
    //   66: aload_0
    //   67: getfield 71	MTT/ThirdAppInfoNew:sImei	Ljava/lang/String;
    //   70: invokevirtual 46	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   73: pop
    //   74: aload_3
    //   75: ldc 73
    //   77: aload_0
    //   78: getfield 76	MTT/ThirdAppInfoNew:sImsi	Ljava/lang/String;
    //   81: invokevirtual 46	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   84: pop
    //   85: aload_3
    //   86: ldc 78
    //   88: aload_0
    //   89: getfield 81	MTT/ThirdAppInfoNew:sMac	Ljava/lang/String;
    //   92: invokevirtual 46	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   95: pop
    //   96: aload_3
    //   97: ldc 83
    //   99: aload_0
    //   100: getfield 87	MTT/ThirdAppInfoNew:iPv	J
    //   103: invokevirtual 90	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   106: pop
    //   107: aload_3
    //   108: ldc 92
    //   110: aload_0
    //   111: getfield 96	MTT/ThirdAppInfoNew:iCoreType	I
    //   114: invokevirtual 99	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   117: pop
    //   118: aload_3
    //   119: ldc 101
    //   121: aload_0
    //   122: getfield 104	MTT/ThirdAppInfoNew:sAppVersionName	Ljava/lang/String;
    //   125: invokevirtual 46	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   128: pop
    //   129: aload_0
    //   130: getfield 107	MTT/ThirdAppInfoNew:sAppSignature	Ljava/lang/String;
    //   133: ifnonnull +159 -> 292
    //   136: aload_3
    //   137: ldc 109
    //   139: ldc 111
    //   141: invokevirtual 46	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   144: pop
    //   145: aload_3
    //   146: ldc 113
    //   148: iconst_3
    //   149: invokevirtual 99	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   152: pop
    //   153: aload_3
    //   154: ldc 115
    //   156: aload_0
    //   157: getfield 118	MTT/ThirdAppInfoNew:sAndroidID	Ljava/lang/String;
    //   160: invokevirtual 46	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   163: pop
    //   164: aload_1
    //   165: invokestatic 124	com/tencent/smtt/sdk/t:gU	(Landroid/content/Context;)Z
    //   168: ifeq +148 -> 316
    //   171: aload_3
    //   172: ldc 126
    //   174: invokestatic 130	com/tencent/smtt/sdk/t:coH	()J
    //   177: invokevirtual 90	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   180: pop
    //   181: aload_0
    //   182: getfield 96	MTT/ThirdAppInfoNew:iCoreType	I
    //   185: ifne +62 -> 247
    //   188: aload_3
    //   189: ldc -124
    //   191: aload_0
    //   192: getfield 135	MTT/ThirdAppInfoNew:sWifiConnectedTime	J
    //   195: invokevirtual 90	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   198: pop
    //   199: aload_3
    //   200: ldc -119
    //   202: aload_0
    //   203: getfield 140	MTT/ThirdAppInfoNew:localCoreVersion	I
    //   206: invokevirtual 99	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   209: pop
    //   210: getstatic 145	com/tencent/smtt/sdk/i:xVa	I
    //   213: istore_2
    //   214: aload_0
    //   215: getfield 140	MTT/ThirdAppInfoNew:localCoreVersion	I
    //   218: ifgt +123 -> 341
    //   221: aload_3
    //   222: ldc -109
    //   224: aload_1
    //   225: invokestatic 153	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
    //   228: invokevirtual 157	com/tencent/smtt/sdk/k:coi	()I
    //   231: invokevirtual 99	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   234: pop
    //   235: iload_2
    //   236: iconst_m1
    //   237: if_icmpne +10 -> 247
    //   240: ldc -97
    //   242: ldc -95
    //   244: invokestatic 167	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   247: invokestatic 173	com/tencent/smtt/sdk/QbSdk:getTID	()Ljava/lang/String;
    //   250: ifnull +40 -> 290
    //   253: aload_0
    //   254: getfield 42	MTT/ThirdAppInfoNew:sAppName	Ljava/lang/String;
    //   257: ldc -81
    //   259: invokevirtual 179	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   262: ifeq +90 -> 352
    //   265: invokestatic 185	com/tencent/smtt/utils/k:cpl	()Lcom/tencent/smtt/utils/k;
    //   268: pop
    //   269: aload_3
    //   270: ldc -69
    //   272: invokestatic 173	com/tencent/smtt/sdk/QbSdk:getTID	()Ljava/lang/String;
    //   275: invokestatic 191	com/tencent/smtt/utils/k:Ym	(Ljava/lang/String;)Ljava/lang/String;
    //   278: invokevirtual 46	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   281: pop
    //   282: aload_3
    //   283: ldc -63
    //   285: iconst_1
    //   286: invokevirtual 99	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   289: pop
    //   290: aload_3
    //   291: areturn
    //   292: aload_3
    //   293: ldc 109
    //   295: aload_0
    //   296: getfield 107	MTT/ThirdAppInfoNew:sAppSignature	Ljava/lang/String;
    //   299: invokevirtual 46	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   302: pop
    //   303: goto -158 -> 145
    //   306: astore_0
    //   307: ldc -97
    //   309: ldc -61
    //   311: invokestatic 167	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   314: aconst_null
    //   315: areturn
    //   316: aload_3
    //   317: ldc 126
    //   319: aload_1
    //   320: invokestatic 201	com/tencent/smtt/sdk/l:go	(Landroid/content/Context;)I
    //   323: invokevirtual 99	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   326: pop
    //   327: aload_3
    //   328: ldc -53
    //   330: aload_1
    //   331: invokestatic 201	com/tencent/smtt/sdk/l:go	(Landroid/content/Context;)I
    //   334: invokevirtual 99	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   337: pop
    //   338: goto -157 -> 181
    //   341: aload_3
    //   342: ldc -109
    //   344: iload_2
    //   345: invokevirtual 99	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   348: pop
    //   349: goto -114 -> 235
    //   352: aload_0
    //   353: getfield 42	MTT/ThirdAppInfoNew:sAppName	Ljava/lang/String;
    //   356: ldc -51
    //   358: invokevirtual 179	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   361: ifeq -71 -> 290
    //   364: aload_3
    //   365: ldc -69
    //   367: invokestatic 173	com/tencent/smtt/sdk/QbSdk:getTID	()Ljava/lang/String;
    //   370: invokevirtual 46	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   373: pop
    //   374: aload_3
    //   375: ldc -63
    //   377: iconst_0
    //   378: invokevirtual 99	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   381: pop
    //   382: aload_3
    //   383: areturn
    //   384: astore_0
    //   385: aload_3
    //   386: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	387	0	paramThirdAppInfoNew	ThirdAppInfoNew
    //   0	387	1	paramContext	Context
    //   213	132	2	i	int
    //   7	379	3	localJSONObject	org.json.JSONObject
    // Exception table:
    //   from	to	target	type
    //   0	145	306	java/lang/Exception
    //   145	181	306	java/lang/Exception
    //   181	235	306	java/lang/Exception
    //   240	247	306	java/lang/Exception
    //   292	303	306	java/lang/Exception
    //   316	338	306	java/lang/Exception
    //   341	349	306	java/lang/Exception
    //   247	290	384	java/lang/Exception
    //   352	382	384	java/lang/Exception
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt, boolean paramBoolean, long paramLong)
  {
    Object localObject3 = "";
    Object localObject2 = localObject3;
    for (;;)
    {
      try
      {
        ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo();
        localObject1 = localObject3;
        localObject2 = localObject3;
        if ("com.tencent.mobileqq".equals(localApplicationInfo.packageName))
        {
          localObject2 = localObject3;
          localObject3 = paramContext.getPackageManager().getPackageInfo(localApplicationInfo.packageName, 0).versionName;
          localObject1 = localObject3;
          localObject2 = localObject3;
          if (!TextUtils.isEmpty(QbSdk.getQQBuildNumber()))
          {
            localObject2 = localObject3;
            localObject1 = (String)localObject3 + "." + QbSdk.getQQBuildNumber();
          }
        }
        localObject2 = localObject1;
      }
      catch (Exception localException)
      {
        final Object localObject1;
        continue;
      }
      try
      {
        localObject1 = new ThirdAppInfoNew();
        ((ThirdAppInfoNew)localObject1).sAppName = paramContext.getApplicationContext().getApplicationInfo().packageName;
        q.hA(paramContext);
        localObject3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        ((SimpleDateFormat)localObject3).setTimeZone(TimeZone.getTimeZone("GMT+08"));
        ((ThirdAppInfoNew)localObject1).sTime = ((SimpleDateFormat)localObject3).format(Calendar.getInstance().getTime());
        ((ThirdAppInfoNew)localObject1).sGuid = paramString1;
        if (paramBoolean)
        {
          ((ThirdAppInfoNew)localObject1).sQua2 = paramString2;
          ((ThirdAppInfoNew)localObject1).sLc = paramString3;
          paramString1 = c.hr(paramContext);
          paramString2 = c.W(paramContext);
          paramString3 = c.hq(paramContext);
          localObject3 = c.hs(paramContext);
          if ((paramString2 != null) && (!"".equals(paramString2))) {
            ((ThirdAppInfoNew)localObject1).sImei = paramString2;
          }
          if ((paramString3 != null) && (!"".equals(paramString3))) {
            ((ThirdAppInfoNew)localObject1).sImsi = paramString3;
          }
          if (!TextUtils.isEmpty((CharSequence)localObject3)) {
            ((ThirdAppInfoNew)localObject1).sAndroidID = ((String)localObject3);
          }
          if ((paramString1 != null) && (!"".equals(paramString1))) {
            ((ThirdAppInfoNew)localObject1).sMac = paramString1;
          }
          ((ThirdAppInfoNew)localObject1).iPv = paramInt;
          if (!t.gU(paramContext)) {
            continue;
          }
          if (!paramBoolean) {
            continue;
          }
          if (t.coN())
          {
            paramInt = 2;
            paramString1 = (String)localObject1;
            paramString1.iCoreType = paramInt;
            ((ThirdAppInfoNew)localObject1).sAppVersionName = ((String)localObject2);
            ((ThirdAppInfoNew)localObject1).sAppSignature = hk(paramContext);
            if (!paramBoolean)
            {
              ((ThirdAppInfoNew)localObject1).sWifiConnectedTime = paramLong;
              ((ThirdAppInfoNew)localObject1).localCoreVersion = QbSdk.getTbsVersion(paramContext);
            }
            new Thread("HttpUtils")
            {
              /* Error */
              public final void run()
              {
                // Byte code:
                //   0: getstatic 40	android/os/Build$VERSION:SDK_INT	I
                //   3: bipush 8
                //   5: if_icmpge +4 -> 9
                //   8: return
                //   9: getstatic 44	com/tencent/smtt/sdk/a/b:xXY	[B
                //   12: ifnonnull +13 -> 25
                //   15: ldc 46
                //   17: ldc 48
                //   19: invokevirtual 54	java/lang/String:getBytes	(Ljava/lang/String;)[B
                //   22: putstatic 44	com/tencent/smtt/sdk/a/b:xXY	[B
                //   25: getstatic 44	com/tencent/smtt/sdk/a/b:xXY	[B
                //   28: ifnonnull +26 -> 54
                //   31: ldc 56
                //   33: ldc 58
                //   35: invokestatic 64	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
                //   38: return
                //   39: astore_2
                //   40: aconst_null
                //   41: putstatic 44	com/tencent/smtt/sdk/a/b:xXY	[B
                //   44: ldc 56
                //   46: ldc 66
                //   48: invokestatic 64	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
                //   51: goto -26 -> 25
                //   54: aload_0
                //   55: getfield 14	com/tencent/smtt/sdk/a/b$1:pHW	Landroid/content/Context;
                //   58: invokestatic 72	com/tencent/smtt/sdk/k:gl	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/k;
                //   61: getfield 76	com/tencent/smtt/sdk/k:xVi	Landroid/content/SharedPreferences;
                //   64: ldc 78
                //   66: ldc 80
                //   68: invokeinterface 86 3 0
                //   73: astore_2
                //   74: aload_2
                //   75: invokestatic 92	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
                //   78: ifne +416 -> 494
                //   81: aload_2
                //   82: iconst_0
                //   83: aload_2
                //   84: ldc 94
                //   86: invokevirtual 98	java/lang/String:indexOf	(Ljava/lang/String;)I
                //   89: invokevirtual 102	java/lang/String:substring	(II)Ljava/lang/String;
                //   92: astore_3
                //   93: aload_2
                //   94: aload_2
                //   95: ldc 94
                //   97: invokevirtual 98	java/lang/String:indexOf	(Ljava/lang/String;)I
                //   100: iconst_1
                //   101: iadd
                //   102: aload_2
                //   103: invokevirtual 106	java/lang/String:length	()I
                //   106: invokevirtual 102	java/lang/String:substring	(II)Ljava/lang/String;
                //   109: astore_2
                //   110: aload_3
                //   111: invokestatic 92	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
                //   114: ifne +28 -> 142
                //   117: aload_3
                //   118: invokevirtual 106	java/lang/String:length	()I
                //   121: bipush 96
                //   123: if_icmpne +19 -> 142
                //   126: aload_2
                //   127: invokestatic 92	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
                //   130: ifne +12 -> 142
                //   133: aload_2
                //   134: invokevirtual 106	java/lang/String:length	()I
                //   137: bipush 24
                //   139: if_icmpeq +135 -> 274
                //   142: iconst_1
                //   143: istore_1
                //   144: invokestatic 112	com/tencent/smtt/utils/q:cpr	()Lcom/tencent/smtt/utils/q;
                //   147: astore 4
                //   149: iload_1
                //   150: ifeq +129 -> 279
                //   153: new 114	java/lang/StringBuilder
                //   156: dup
                //   157: invokespecial 116	java/lang/StringBuilder:<init>	()V
                //   160: aload 4
                //   162: getfield 120	com/tencent/smtt/utils/q:xYX	Ljava/lang/String;
                //   165: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   168: astore_3
                //   169: invokestatic 130	com/tencent/smtt/utils/j:cpi	()Lcom/tencent/smtt/utils/j;
                //   172: pop
                //   173: aload_3
                //   174: invokestatic 134	com/tencent/smtt/utils/j:cpj	()Ljava/lang/String;
                //   177: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   180: invokevirtual 137	java/lang/StringBuilder:toString	()Ljava/lang/String;
                //   183: astore_3
                //   184: new 139	java/net/URL
                //   187: dup
                //   188: aload_3
                //   189: invokespecial 140	java/net/URL:<init>	(Ljava/lang/String;)V
                //   192: invokevirtual 144	java/net/URL:openConnection	()Ljava/net/URLConnection;
                //   195: checkcast 146	java/net/HttpURLConnection
                //   198: astore 4
                //   200: aload 4
                //   202: ldc -108
                //   204: invokevirtual 151	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
                //   207: aload 4
                //   209: iconst_1
                //   210: invokevirtual 155	java/net/HttpURLConnection:setDoOutput	(Z)V
                //   213: aload 4
                //   215: iconst_1
                //   216: invokevirtual 158	java/net/HttpURLConnection:setDoInput	(Z)V
                //   219: aload 4
                //   221: iconst_0
                //   222: invokevirtual 161	java/net/HttpURLConnection:setUseCaches	(Z)V
                //   225: aload 4
                //   227: sipush 20000
                //   230: invokevirtual 165	java/net/HttpURLConnection:setConnectTimeout	(I)V
                //   233: getstatic 40	android/os/Build$VERSION:SDK_INT	I
                //   236: bipush 13
                //   238: if_icmple +12 -> 250
                //   241: aload 4
                //   243: ldc -89
                //   245: ldc -87
                //   247: invokevirtual 172	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
                //   250: aload_0
                //   251: getfield 16	com/tencent/smtt/sdk/a/b$1:xXZ	LMTT/ThirdAppInfoNew;
                //   254: aload_0
                //   255: getfield 14	com/tencent/smtt/sdk/a/b$1:pHW	Landroid/content/Context;
                //   258: invokestatic 176	com/tencent/smtt/sdk/a/b:a	(LMTT/ThirdAppInfoNew;Landroid/content/Context;)Lorg/json/JSONObject;
                //   261: astore_3
                //   262: aload_3
                //   263: ifnonnull +117 -> 380
                //   266: ldc 56
                //   268: ldc -78
                //   270: invokestatic 64	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
                //   273: return
                //   274: iconst_0
                //   275: istore_1
                //   276: goto -132 -> 144
                //   279: new 114	java/lang/StringBuilder
                //   282: dup
                //   283: invokespecial 116	java/lang/StringBuilder:<init>	()V
                //   286: aload 4
                //   288: getfield 181	com/tencent/smtt/utils/q:xYY	Ljava/lang/String;
                //   291: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   294: aload_3
                //   295: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   298: invokevirtual 137	java/lang/StringBuilder:toString	()Ljava/lang/String;
                //   301: astore_3
                //   302: goto -118 -> 184
                //   305: astore_2
                //   306: ldc 56
                //   308: new 114	java/lang/StringBuilder
                //   311: dup
                //   312: ldc -73
                //   314: invokespecial 184	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
                //   317: aload_2
                //   318: invokevirtual 187	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                //   321: invokevirtual 137	java/lang/StringBuilder:toString	()Ljava/lang/String;
                //   324: invokestatic 64	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
                //   327: return
                //   328: astore_2
                //   329: ldc 56
                //   331: new 114	java/lang/StringBuilder
                //   334: dup
                //   335: ldc -67
                //   337: invokespecial 184	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
                //   340: aload_2
                //   341: invokevirtual 187	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                //   344: invokevirtual 137	java/lang/StringBuilder:toString	()Ljava/lang/String;
                //   347: invokestatic 64	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
                //   350: return
                //   351: astore_2
                //   352: ldc 56
                //   354: new 114	java/lang/StringBuilder
                //   357: dup
                //   358: ldc -65
                //   360: invokespecial 184	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
                //   363: aload_2
                //   364: invokevirtual 187	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                //   367: invokevirtual 137	java/lang/StringBuilder:toString	()Ljava/lang/String;
                //   370: invokestatic 64	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
                //   373: return
                //   374: astore_3
                //   375: aconst_null
                //   376: astore_3
                //   377: goto -115 -> 262
                //   380: aload_3
                //   381: invokevirtual 194	org/json/JSONObject:toString	()Ljava/lang/String;
                //   384: ldc 48
                //   386: invokevirtual 54	java/lang/String:getBytes	(Ljava/lang/String;)[B
                //   389: astore_3
                //   390: iload_1
                //   391: ifeq +92 -> 483
                //   394: invokestatic 130	com/tencent/smtt/utils/j:cpi	()Lcom/tencent/smtt/utils/j;
                //   397: aload_3
                //   398: invokevirtual 198	com/tencent/smtt/utils/j:bF	([B)[B
                //   401: astore_2
                //   402: aload 4
                //   404: ldc -56
                //   406: ldc -54
                //   408: invokevirtual 172	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
                //   411: aload 4
                //   413: ldc -52
                //   415: aload_2
                //   416: arraylength
                //   417: invokestatic 208	java/lang/String:valueOf	(I)Ljava/lang/String;
                //   420: invokevirtual 172	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
                //   423: aload 4
                //   425: invokevirtual 212	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
                //   428: astore_3
                //   429: aload_3
                //   430: aload_2
                //   431: invokevirtual 218	java/io/OutputStream:write	([B)V
                //   434: aload_3
                //   435: invokevirtual 221	java/io/OutputStream:flush	()V
                //   438: aload 4
                //   440: invokevirtual 224	java/net/HttpURLConnection:getResponseCode	()I
                //   443: sipush 200
                //   446: if_icmpeq -438 -> 8
                //   449: ldc 56
                //   451: ldc -30
                //   453: invokestatic 64	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
                //   456: return
                //   457: astore_2
                //   458: ldc 56
                //   460: new 114	java/lang/StringBuilder
                //   463: dup
                //   464: ldc -28
                //   466: invokespecial 184	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
                //   469: aload_2
                //   470: invokevirtual 231	java/lang/Throwable:getMessage	()Ljava/lang/String;
                //   473: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   476: invokevirtual 137	java/lang/StringBuilder:toString	()Ljava/lang/String;
                //   479: invokestatic 64	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
                //   482: return
                //   483: aload_3
                //   484: aload_2
                //   485: invokestatic 235	com/tencent/smtt/utils/j:j	([BLjava/lang/String;)[B
                //   488: astore_2
                //   489: goto -87 -> 402
                //   492: astore_2
                //   493: return
                //   494: ldc 80
                //   496: astore_3
                //   497: ldc 80
                //   499: astore_2
                //   500: goto -390 -> 110
                // Local variable table:
                //   start	length	slot	name	signature
                //   0	503	0	this	1
                //   143	248	1	i	int
                //   39	1	2	localUnsupportedEncodingException	UnsupportedEncodingException
                //   73	61	2	str1	String
                //   305	13	2	localIOException	java.io.IOException
                //   328	13	2	localAssertionError	AssertionError
                //   351	13	2	localNoClassDefFoundError	NoClassDefFoundError
                //   401	30	2	arrayOfByte1	byte[]
                //   457	28	2	localThrowable1	Throwable
                //   488	1	2	arrayOfByte2	byte[]
                //   492	1	2	localThrowable2	Throwable
                //   499	1	2	str2	String
                //   92	210	3	localObject1	Object
                //   374	1	3	localException	Exception
                //   376	121	3	localObject2	Object
                //   147	292	4	localObject3	Object
                // Exception table:
                //   from	to	target	type
                //   15	25	39	java/io/UnsupportedEncodingException
                //   144	149	305	java/io/IOException
                //   153	184	305	java/io/IOException
                //   184	207	305	java/io/IOException
                //   279	302	305	java/io/IOException
                //   144	149	328	java/lang/AssertionError
                //   153	184	328	java/lang/AssertionError
                //   184	207	328	java/lang/AssertionError
                //   279	302	328	java/lang/AssertionError
                //   144	149	351	java/lang/NoClassDefFoundError
                //   153	184	351	java/lang/NoClassDefFoundError
                //   184	207	351	java/lang/NoClassDefFoundError
                //   279	302	351	java/lang/NoClassDefFoundError
                //   250	262	374	java/lang/Exception
                //   423	456	457	java/lang/Throwable
                //   380	390	492	java/lang/Throwable
                //   394	402	492	java/lang/Throwable
                //   483	489	492	java/lang/Throwable
              }
            }.start();
          }
        }
        else
        {
          ((ThirdAppInfoNew)localObject1).sQua2 = p.hx(paramContext);
          continue;
        }
        paramInt = 1;
      }
      catch (Throwable paramContext)
      {
        return;
      }
      paramString1 = (String)localObject1;
    }
    for (;;)
    {
      paramString1 = (String)localObject1;
      paramInt = 0;
      break;
      if (paramBoolean)
      {
        paramInt = 1;
        paramString1 = (String)localObject1;
        break;
      }
    }
  }
  
  private static String hk(Context paramContext)
  {
    int i = 0;
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 64).signatures[0].toByteArray();
      if (paramContext != null)
      {
        Object localObject = MessageDigest.getInstance("SHA-1");
        ((MessageDigest)localObject).update(paramContext);
        paramContext = ((MessageDigest)localObject).digest();
        if (paramContext != null)
        {
          localObject = new StringBuilder("");
          if (paramContext != null)
          {
            if (paramContext.length <= 0) {
              return null;
            }
            while (i < paramContext.length)
            {
              String str = Integer.toHexString(paramContext[i] & 0xFF).toUpperCase();
              if (i > 0) {
                ((StringBuilder)localObject).append(":");
              }
              if (str.length() < 2) {
                ((StringBuilder)localObject).append(0);
              }
              ((StringBuilder)localObject).append(str);
              i += 1;
            }
            paramContext = ((StringBuilder)localObject).toString();
            return paramContext;
          }
        }
      }
    }
    catch (Exception paramContext) {}
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */