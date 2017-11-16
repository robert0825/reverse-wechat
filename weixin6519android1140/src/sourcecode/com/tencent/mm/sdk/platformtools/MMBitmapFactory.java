package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.AssetManager.AssetInputStream;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.NinePatch;
import android.graphics.Rect;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.d.m;
import com.tencent.mm.compatible.loader.d;
import com.tencent.mm.modelsfs.FileOp;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

public class MMBitmapFactory
{
  public static final int DECODER_ID_MMJPEG_DECODER = 2;
  public static final int DECODER_ID_MMPNG_DECODER = 0;
  public static final int DECODER_ID_MMVCODEC_DECODER = 1;
  private static final Bitmap.Config DEFAULT_BITMAP_CONFIG;
  private static final int DEFAULT_CHECK_STORAGE_SIZE = 8192;
  private static final int DEFAULT_DECODE_MARK_SIZE = 8388608;
  private static final int DEFAULT_DECODE_STORAGE_SIZE = 8192;
  public static final int DEFAULT_DECODE_STRATEGY = 1;
  public static final int ERROR_ALLOCATE_STRUCT_FAILED = 1001;
  public static final int ERROR_BEGIN_SAMPLE_FAILED = 1004;
  public static final int ERROR_GET_PIXEL_FORMAT_FAILED = 1003;
  public static final int ERROR_ILLEGAL_IDATA_CHUNK = 2003;
  public static final int ERROR_ILLEGAL_IMAGE_SIZE = 1008;
  public static final int ERROR_ILLEGAL_NPTC_CHUNK = 2002;
  public static final int ERROR_IMAGE_SIZE_IS_TOO_LARGE = 1007;
  public static final int ERROR_IMG_BUG_DETECTED_BEGIN = 2000;
  public static final int ERROR_IO_FAILED = 1005;
  public static final int ERROR_LOCK_BITMAP_FAILED = 1002;
  public static final int ERROR_PNG_BUG_DETECTED_BEGIN = 2001;
  public static final int ERROR_SUCCESS = 0;
  public static final int ERROR_UNSUPPORT_IMAGE_FORMAT = 1006;
  private static final int ERROR_USER_DEFINED_BEGIN = 3000;
  public static final int STRATEGY_AUTO_DETECT = 0;
  public static final int STRATEGY_FORCE_SYSTEM_DECODER = 1;
  private static final String TAG = "MicroMsg.MMBitmapFactory";
  private static boolean mIsInit;
  static Method mMthGetDefaultDensity;
  
  static
  {
    GMTrace.i(13767651885056L, 102577);
    mIsInit = false;
    DEFAULT_BITMAP_CONFIG = Bitmap.Config.ARGB_8888;
    mMthGetDefaultDensity = null;
    GMTrace.o(13767651885056L, 102577);
  }
  
  public MMBitmapFactory()
  {
    GMTrace.i(13759867256832L, 102519);
    GMTrace.o(13759867256832L, 102519);
  }
  
  private static boolean checkIfHaveToUseMMDecoder(BitmapFactory.Options paramOptions)
  {
    GMTrace.i(13766309707776L, 102567);
    if (paramOptions != null) {}
    for (String str = paramOptions.outMimeType;; str = "")
    {
      w.d("MicroMsg.MMBitmapFactory", "mimetype: %s", new Object[] { str });
      if ((paramOptions == null) || (paramOptions.outMimeType == null) || ((!paramOptions.outMimeType.toLowerCase().endsWith("png")) && (!paramOptions.outMimeType.toLowerCase().endsWith("vcodec")))) {
        break;
      }
      GMTrace.o(13766309707776L, 102567);
      return true;
    }
    GMTrace.o(13766309707776L, 102567);
    return false;
  }
  
  public static boolean checkIsImageLegal(InputStream paramInputStream)
  {
    GMTrace.i(13760806780928L, 102526);
    boolean bool = checkIsImageLegal(paramInputStream, null);
    GMTrace.o(13760806780928L, 102526);
    return bool;
  }
  
  public static boolean checkIsImageLegal(InputStream paramInputStream, DecodeResultLogger paramDecodeResultLogger)
  {
    GMTrace.i(13761209434112L, 102529);
    boolean bool = checkIsImageLegalInternal(paramInputStream, paramDecodeResultLogger);
    GMTrace.o(13761209434112L, 102529);
    return bool;
  }
  
  public static boolean checkIsImageLegal(String paramString)
  {
    GMTrace.i(13760538345472L, 102524);
    boolean bool = checkIsImageLegal(paramString, null);
    GMTrace.o(13760538345472L, 102524);
    return bool;
  }
  
  /* Error */
  public static boolean checkIsImageLegal(String paramString, DecodeResultLogger paramDecodeResultLogger)
  {
    // Byte code:
    //   0: ldc2_w 157
    //   3: ldc -97
    //   5: invokestatic 79	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: ifnonnull +31 -> 40
    //   12: ldc 64
    //   14: ldc -95
    //   16: invokestatic 165	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: aload_1
    //   20: ifnull +10 -> 30
    //   23: aload_1
    //   24: sipush 1005
    //   27: putfield 168	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:mDecodeResultCode	I
    //   30: ldc2_w 157
    //   33: ldc -97
    //   35: invokestatic 93	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   38: iconst_0
    //   39: ireturn
    //   40: new 170	java/io/BufferedInputStream
    //   43: dup
    //   44: new 172	java/io/FileInputStream
    //   47: dup
    //   48: aload_0
    //   49: invokespecial 175	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   52: invokespecial 178	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   55: astore 6
    //   57: aload 6
    //   59: astore 5
    //   61: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   64: lstore_2
    //   65: aload 6
    //   67: astore 5
    //   69: aload 6
    //   71: aload_1
    //   72: invokestatic 148	com/tencent/mm/sdk/platformtools/MMBitmapFactory:checkIsImageLegalInternal	(Ljava/io/InputStream;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Z
    //   75: istore 4
    //   77: aload 6
    //   79: astore 5
    //   81: ldc 64
    //   83: ldc -70
    //   85: iconst_3
    //   86: anewarray 4	java/lang/Object
    //   89: dup
    //   90: iconst_0
    //   91: aload_0
    //   92: aastore
    //   93: dup
    //   94: iconst_1
    //   95: iload 4
    //   97: invokestatic 192	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   100: aastore
    //   101: dup
    //   102: iconst_2
    //   103: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   106: lload_2
    //   107: lsub
    //   108: invokestatic 197	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   111: aastore
    //   112: invokestatic 118	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   115: aload 6
    //   117: invokestatic 203	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   120: ldc2_w 157
    //   123: ldc -97
    //   125: invokestatic 93	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   128: iload 4
    //   130: ireturn
    //   131: astore 7
    //   133: aconst_null
    //   134: astore_0
    //   135: aload_0
    //   136: astore 5
    //   138: ldc 64
    //   140: aload 7
    //   142: ldc -51
    //   144: iconst_0
    //   145: anewarray 4	java/lang/Object
    //   148: invokestatic 209	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   151: aload_1
    //   152: ifnull +13 -> 165
    //   155: aload_0
    //   156: astore 5
    //   158: aload_1
    //   159: sipush 1005
    //   162: putfield 168	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:mDecodeResultCode	I
    //   165: aload_0
    //   166: invokestatic 203	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   169: ldc2_w 157
    //   172: ldc -97
    //   174: invokestatic 93	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   177: iconst_0
    //   178: ireturn
    //   179: astore_0
    //   180: aconst_null
    //   181: astore 5
    //   183: aload 5
    //   185: invokestatic 203	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   188: aload_0
    //   189: athrow
    //   190: astore_0
    //   191: goto -8 -> 183
    //   194: astore 7
    //   196: aload 6
    //   198: astore_0
    //   199: goto -64 -> 135
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	202	0	paramString	String
    //   0	202	1	paramDecodeResultLogger	DecodeResultLogger
    //   64	43	2	l	long
    //   75	54	4	bool	boolean
    //   59	125	5	localObject	Object
    //   55	142	6	localBufferedInputStream	BufferedInputStream
    //   131	10	7	localFileNotFoundException1	FileNotFoundException
    //   194	1	7	localFileNotFoundException2	FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   40	57	131	java/io/FileNotFoundException
    //   40	57	179	finally
    //   61	65	190	finally
    //   69	77	190	finally
    //   81	115	190	finally
    //   138	151	190	finally
    //   158	165	190	finally
    //   61	65	194	java/io/FileNotFoundException
    //   69	77	194	java/io/FileNotFoundException
    //   81	115	194	java/io/FileNotFoundException
  }
  
  public static boolean checkIsImageLegal(byte[] paramArrayOfByte)
  {
    GMTrace.i(13760672563200L, 102525);
    boolean bool = checkIsImageLegal(paramArrayOfByte, null);
    GMTrace.o(13760672563200L, 102525);
    return bool;
  }
  
  public static boolean checkIsImageLegal(byte[] paramArrayOfByte, DecodeResultLogger paramDecodeResultLogger)
  {
    GMTrace.i(13761075216384L, 102528);
    if (paramArrayOfByte == null)
    {
      w.e("MicroMsg.MMBitmapFactory", "buf is null.");
      if (paramDecodeResultLogger != null) {
        paramDecodeResultLogger.mDecodeResultCode = 1005;
      }
      GMTrace.o(13761075216384L, 102528);
      return false;
    }
    boolean bool = checkIsImageLegalInternal(new ByteArrayInputStream(paramArrayOfByte), paramDecodeResultLogger);
    GMTrace.o(13761075216384L, 102528);
    return bool;
  }
  
  private static boolean checkIsImageLegalInternal(InputStream paramInputStream, DecodeResultLogger paramDecodeResultLogger)
  {
    GMTrace.i(13761343651840L, 102530);
    if (paramInputStream == null)
    {
      w.e("MicroMsg.MMBitmapFactory", "InputStream is null.");
      if (paramDecodeResultLogger != null) {
        paramDecodeResultLogger.mDecodeResultCode = 1005;
      }
      GMTrace.o(13761343651840L, 102530);
      return false;
    }
    if (!DynamicConfigStorage.getValue(DynamicConfigStorage.PREF_KEY_IS_ENABLE_MM_BITMAP_FACTORY, false))
    {
      GMTrace.o(13761343651840L, 102530);
      return true;
    }
    int i = nativeCheckIsImageLegal(paramInputStream, new byte[' '], paramDecodeResultLogger);
    if ((i == 0) || (i == 1006))
    {
      GMTrace.o(13761343651840L, 102530);
      return true;
    }
    GMTrace.o(13761343651840L, 102530);
    return false;
  }
  
  private static void checkIsInit()
  {
    GMTrace.i(13760001474560L, 102520);
    if (!mIsInit) {
      w.w("MicroMsg.MMBitmapFactory", "MMBitmapFactory is not initialized.");
    }
    GMTrace.o(13760001474560L, 102520);
  }
  
  public static Bitmap decodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    GMTrace.i(13761477869568L, 102531);
    paramArrayOfByte = decodeByteArray(paramArrayOfByte, paramInt1, paramInt2, null, null, 1, new int[0]);
    GMTrace.o(13761477869568L, 102531);
    return paramArrayOfByte;
  }
  
  public static Bitmap decodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(13761612087296L, 102532);
    paramArrayOfByte = decodeByteArray(paramArrayOfByte, paramInt1, paramInt2, null, null, paramInt3, new int[0]);
    GMTrace.o(13761612087296L, 102532);
    return paramArrayOfByte;
  }
  
  public static Bitmap decodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2, BitmapFactory.Options paramOptions)
  {
    GMTrace.i(13761746305024L, 102533);
    paramArrayOfByte = decodeByteArray(paramArrayOfByte, paramInt1, paramInt2, paramOptions, null, 1, new int[0]);
    GMTrace.o(13761746305024L, 102533);
    return paramArrayOfByte;
  }
  
  public static Bitmap decodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2, BitmapFactory.Options paramOptions, int paramInt3)
  {
    GMTrace.i(13761880522752L, 102534);
    paramArrayOfByte = decodeByteArray(paramArrayOfByte, paramInt1, paramInt2, paramOptions, null, paramInt3, new int[0]);
    GMTrace.o(13761880522752L, 102534);
    return paramArrayOfByte;
  }
  
  public static Bitmap decodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger)
  {
    GMTrace.i(13762283175936L, 102537);
    paramArrayOfByte = decodeByteArray(paramArrayOfByte, paramInt1, paramInt2, paramOptions, paramDecodeResultLogger, 1, new int[0]);
    GMTrace.o(13762283175936L, 102537);
    return paramArrayOfByte;
  }
  
  public static Bitmap decodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger, int paramInt3, int... paramVarArgs)
  {
    GMTrace.i(13762417393664L, 102538);
    long l = System.currentTimeMillis();
    paramArrayOfByte = decodeByteArrayInternal(paramArrayOfByte, paramInt1, paramInt2, paramOptions, paramDecodeResultLogger, paramInt3, paramVarArgs);
    w.i("MicroMsg.MMBitmapFactory", "decode done, size:%d, cost:%d ms", new Object[] { Integer.valueOf(paramInt2), Long.valueOf(System.currentTimeMillis() - l) });
    GMTrace.o(13762417393664L, 102538);
    return paramArrayOfByte;
  }
  
  public static Bitmap decodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2, DecodeResultLogger paramDecodeResultLogger)
  {
    GMTrace.i(13762014740480L, 102535);
    paramArrayOfByte = decodeByteArray(paramArrayOfByte, paramInt1, paramInt2, null, paramDecodeResultLogger, 1, new int[0]);
    GMTrace.o(13762014740480L, 102535);
    return paramArrayOfByte;
  }
  
  public static Bitmap decodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2, DecodeResultLogger paramDecodeResultLogger, int paramInt3, int... paramVarArgs)
  {
    GMTrace.i(13762148958208L, 102536);
    paramArrayOfByte = decodeByteArray(paramArrayOfByte, paramInt1, paramInt2, null, paramDecodeResultLogger, paramInt3, paramVarArgs);
    GMTrace.o(13762148958208L, 102536);
    return paramArrayOfByte;
  }
  
  private static Bitmap decodeByteArrayInternal(byte[] paramArrayOfByte, int paramInt1, int paramInt2, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger, int paramInt3, int... paramVarArgs)
  {
    GMTrace.i(13762551611392L, 102539);
    checkIsInit();
    boolean bool = DynamicConfigStorage.getValue(DynamicConfigStorage.PREF_KEY_IS_ENABLE_MM_BITMAP_FACTORY, false);
    if (bool) {
      switch (paramInt3)
      {
      default: 
        w.i("MicroMsg.MMBitmapFactory", "Decoded by system BitmapFactory directly, isEnabled:%b", new Object[] { Boolean.valueOf(bool) });
        paramArrayOfByte = decodeByteArrayWithSystemDecoder(paramArrayOfByte, paramInt1, paramInt2, paramOptions, paramDecodeResultLogger);
      }
    }
    for (;;)
    {
      GMTrace.o(13762551611392L, 102539);
      return paramArrayOfByte;
      paramArrayOfByte = decodeByteArrayWithMMDecoderIfPossible(paramArrayOfByte, paramInt1, paramInt2, paramOptions, paramDecodeResultLogger, paramVarArgs);
      continue;
      w.i("MicroMsg.MMBitmapFactory", "Decoded by system BitmapFactory directly since strategy, isEnabled:%b", new Object[] { Boolean.valueOf(bool) });
      paramArrayOfByte = decodeByteArrayWithSystemDecoder(paramArrayOfByte, paramInt1, paramInt2, paramOptions, paramDecodeResultLogger);
    }
  }
  
  private static Bitmap decodeByteArrayWithMMDecoderIfPossible(byte[] paramArrayOfByte, int paramInt1, int paramInt2, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger, int... paramVarArgs)
  {
    GMTrace.i(13762685829120L, 102540);
    if (paramDecodeResultLogger == null) {
      for (;;)
      {
        try
        {
          localObject = new DecodeResultLogger();
          paramDecodeResultLogger = (DecodeResultLogger)localObject;
        }
        catch (Exception paramArrayOfByte)
        {
          Object localObject;
          label173:
          paramVarArgs = null;
          continue;
        }
        try
        {
          localObject = nativeDecodeByteArray(paramArrayOfByte, paramInt1, paramInt2, paramOptions, paramDecodeResultLogger, paramVarArgs);
          paramVarArgs = (int[])localObject;
          try
          {
            if (paramDecodeResultLogger.mDecodeResultCode == 0) {
              continue;
            }
            paramVarArgs = (int[])localObject;
            if (paramDecodeResultLogger.mDecodeResultCode >= 2000) {
              continue;
            }
            paramVarArgs = (int[])localObject;
            w.i("MicroMsg.MMBitmapFactory", "mmimgdec decoder decodes failed, try system BitmapFactory.");
            paramVarArgs = (int[])localObject;
            paramDecodeResultLogger.mIsDecodeByMMDecoder = false;
            paramVarArgs = (int[])localObject;
            localObject = BitmapFactory.decodeByteArray(paramArrayOfByte, paramInt1, paramInt2, paramOptions);
            if (localObject == null)
            {
              if (paramOptions != null)
              {
                paramVarArgs = (int[])localObject;
                if (paramOptions.inJustDecodeBounds)
                {
                  paramVarArgs = (int[])localObject;
                  if (paramOptions.outWidth >= 0)
                  {
                    paramVarArgs = (int[])localObject;
                    if (paramOptions.outHeight < 0) {}
                  }
                }
              }
            }
            else
            {
              paramVarArgs = (int[])localObject;
              w.i("MicroMsg.MMBitmapFactory", "System decoder decodes success.");
              paramVarArgs = (int[])localObject;
              paramDecodeResultLogger.mDecodeResultCode = 0;
              paramArrayOfByte = paramDecodeResultLogger;
              paramVarArgs = (int[])localObject;
              w.i("MicroMsg.MMBitmapFactory", paramArrayOfByte.toLogString());
              GMTrace.o(13762685829120L, 102540);
              return paramVarArgs;
            }
            paramVarArgs = (int[])localObject;
            w.w("MicroMsg.MMBitmapFactory", "System decoder decodes failed.");
            paramVarArgs = (int[])localObject;
            paramDecodeResultLogger.mDecodeResultCode = 1006;
            paramVarArgs = (int[])localObject;
            paramArrayOfByte = paramDecodeResultLogger;
            continue;
            w.printErrStackTrace("MicroMsg.MMBitmapFactory", paramArrayOfByte, "An exception was thrown when decode image.", new Object[0]);
          }
          catch (Exception paramArrayOfByte) {}
        }
        catch (Exception paramArrayOfByte)
        {
          paramVarArgs = null;
          continue;
        }
        paramDecodeResultLogger.mDecodeResultCode = 1005;
        paramArrayOfByte = paramDecodeResultLogger;
        continue;
        paramVarArgs = (int[])localObject;
        w.i("MicroMsg.MMBitmapFactory", "decoder [%s] decodes done, ret:%d.", new Object[] { paramDecodeResultLogger.mDecoderTag, Integer.valueOf(paramDecodeResultLogger.mDecodeResultCode) });
        paramVarArgs = (int[])localObject;
        paramArrayOfByte = paramDecodeResultLogger;
        if (localObject != null)
        {
          paramArrayOfByte = (byte[])localObject;
          if (paramOptions != null)
          {
            paramVarArgs = (int[])localObject;
            paramArrayOfByte = (byte[])localObject;
            if (paramOptions.inScaled)
            {
              paramVarArgs = (int[])localObject;
              paramArrayOfByte = (byte[])localObject;
              if (!paramOptions.inJustDecodeBounds)
              {
                paramVarArgs = (int[])localObject;
                paramArrayOfByte = getScaledBitmap((Bitmap)localObject, paramOptions);
                if (paramArrayOfByte == localObject) {
                  break label401;
                }
                paramVarArgs = (int[])localObject;
                ((Bitmap)localObject).recycle();
                break label401;
              }
            }
          }
        }
      }
    }
    label401:
    for (;;)
    {
      paramVarArgs = paramArrayOfByte;
      setDensityFromOptions(paramArrayOfByte, paramOptions);
      paramVarArgs = paramArrayOfByte;
      paramArrayOfByte = paramDecodeResultLogger;
      break label173;
      break;
    }
  }
  
  private static Bitmap decodeByteArrayWithSystemDecoder(byte[] paramArrayOfByte, int paramInt1, int paramInt2, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger)
  {
    GMTrace.i(13762820046848L, 102541);
    paramOptions = BitmapFactory.decodeByteArray(paramArrayOfByte, paramInt1, paramInt2, paramOptions);
    if (paramDecodeResultLogger != null)
    {
      paramDecodeResultLogger.clear();
      if (paramOptions != null)
      {
        paramInt1 = 0;
        paramDecodeResultLogger.mDecodeResultCode = paramInt1;
        paramDecodeResultLogger.mIsDecodeByMMDecoder = false;
      }
    }
    else
    {
      if (paramOptions == null) {
        break label88;
      }
    }
    label88:
    for (paramArrayOfByte = paramOptions.toString();; paramArrayOfByte = "null")
    {
      w.i("MicroMsg.MMBitmapFactory", "decode bytearray by system decoder done, res: %s", new Object[] { paramArrayOfByte });
      GMTrace.o(13762820046848L, 102541);
      return paramOptions;
      paramInt1 = 1006;
      break;
    }
  }
  
  public static Bitmap decodeFile(String paramString)
  {
    GMTrace.i(13762954264576L, 102542);
    paramString = decodeFile(paramString, null, null, 1, new int[0]);
    GMTrace.o(13762954264576L, 102542);
    return paramString;
  }
  
  public static Bitmap decodeFile(String paramString, int paramInt)
  {
    GMTrace.i(13763088482304L, 102543);
    paramString = decodeFile(paramString, null, null, paramInt, new int[0]);
    GMTrace.o(13763088482304L, 102543);
    return paramString;
  }
  
  public static Bitmap decodeFile(String paramString, BitmapFactory.Options paramOptions)
  {
    GMTrace.i(13763222700032L, 102544);
    paramString = decodeFile(paramString, paramOptions, null, 1, new int[0]);
    GMTrace.o(13763222700032L, 102544);
    return paramString;
  }
  
  public static Bitmap decodeFile(String paramString, BitmapFactory.Options paramOptions, int paramInt)
  {
    GMTrace.i(13763356917760L, 102545);
    paramString = decodeFile(paramString, paramOptions, null, paramInt, new int[0]);
    GMTrace.o(13763356917760L, 102545);
    return paramString;
  }
  
  public static Bitmap decodeFile(String paramString, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger, int paramInt, int... paramVarArgs)
  {
    GMTrace.i(13763759570944L, 102548);
    try
    {
      paramString = decodeStream(FileOp.openRead(paramString), null, paramOptions, paramDecodeResultLogger, paramInt, paramVarArgs);
      GMTrace.o(13763759570944L, 102548);
      return paramString;
    }
    catch (FileNotFoundException paramString)
    {
      GMTrace.o(13763759570944L, 102548);
    }
    return null;
  }
  
  public static Bitmap decodeFile(String paramString, DecodeResultLogger paramDecodeResultLogger)
  {
    GMTrace.i(13763491135488L, 102546);
    paramString = decodeFile(paramString, null, paramDecodeResultLogger, 1, new int[0]);
    GMTrace.o(13763491135488L, 102546);
    return paramString;
  }
  
  public static Bitmap decodeFile(String paramString, DecodeResultLogger paramDecodeResultLogger, int paramInt)
  {
    GMTrace.i(13763625353216L, 102547);
    paramString = decodeFile(paramString, null, paramDecodeResultLogger, paramInt, new int[0]);
    GMTrace.o(13763625353216L, 102547);
    return paramString;
  }
  
  public static Bitmap decodeFileDescriptor(FileDescriptor paramFileDescriptor, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger)
  {
    Object localObject2 = null;
    GMTrace.i(13766175490048L, 102566);
    if (!checkIfHaveToUseMMDecoder(paramOptions)) {}
    for (;;)
    {
      try
      {
        Bitmap localBitmap = BitmapFactory.decodeFileDescriptor(paramFileDescriptor, null, paramOptions);
        if (localBitmap == null) {
          break;
        }
        paramFileDescriptor = localBitmap;
        if (paramDecodeResultLogger != null)
        {
          paramDecodeResultLogger.clear();
          paramDecodeResultLogger.mDecodeResultCode = 0;
          paramDecodeResultLogger.mIsDecodeByMMDecoder = false;
          paramFileDescriptor = localBitmap;
        }
        label52:
        GMTrace.o(13766175490048L, 102566);
        return paramFileDescriptor;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.MMBitmapFactory", localException, "", new Object[0]);
      }
      Object localObject1 = null;
    }
    w.d("MicroMsg.MMBitmapFactory", "decodeFileDescriptor, fallback");
    try
    {
      paramFileDescriptor = new FileInputStream(paramFileDescriptor);
    }
    finally
    {
      try
      {
        paramOptions = decodeStream(paramFileDescriptor, null, paramOptions, paramDecodeResultLogger, 0, new int[0]);
        bg.g(paramFileDescriptor);
        paramFileDescriptor = paramOptions;
        break label52;
      }
      finally {}
      paramOptions = finally;
      paramFileDescriptor = (FileDescriptor)localObject2;
      bg.g(paramFileDescriptor);
      throw paramOptions;
    }
  }
  
  /* Error */
  public static Bitmap decodeRegion(FileDescriptor paramFileDescriptor, Rect paramRect, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 7
    //   3: ldc2_w 447
    //   6: ldc_w 449
    //   9: invokestatic 79	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: aload_2
    //   13: invokestatic 434	com/tencent/mm/sdk/platformtools/MMBitmapFactory:checkIfHaveToUseMMDecoder	(Landroid/graphics/BitmapFactory$Options;)Z
    //   16: ifne +196 -> 212
    //   19: aload_0
    //   20: iconst_1
    //   21: invokestatic 455	android/graphics/BitmapRegionDecoder:newInstance	(Ljava/io/FileDescriptor;Z)Landroid/graphics/BitmapRegionDecoder;
    //   24: astore 5
    //   26: aload 5
    //   28: astore 4
    //   30: aload 5
    //   32: aload_1
    //   33: aload_2
    //   34: invokevirtual 458	android/graphics/BitmapRegionDecoder:decodeRegion	(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   37: astore 6
    //   39: aload 6
    //   41: astore 4
    //   43: aload 5
    //   45: ifnull +12 -> 57
    //   48: aload 5
    //   50: invokevirtual 459	android/graphics/BitmapRegionDecoder:recycle	()V
    //   53: aload 6
    //   55: astore 4
    //   57: aload 4
    //   59: ifnull +92 -> 151
    //   62: aload 4
    //   64: astore_0
    //   65: aload_3
    //   66: ifnull +20 -> 86
    //   69: aload_3
    //   70: invokevirtual 379	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:clear	()V
    //   73: aload_3
    //   74: iconst_0
    //   75: putfield 168	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:mDecodeResultCode	I
    //   78: aload_3
    //   79: iconst_0
    //   80: putfield 330	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:mIsDecodeByMMDecoder	Z
    //   83: aload 4
    //   85: astore_0
    //   86: ldc2_w 447
    //   89: ldc_w 449
    //   92: invokestatic 93	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   95: aload_0
    //   96: areturn
    //   97: astore 6
    //   99: aconst_null
    //   100: astore 5
    //   102: aload 5
    //   104: astore 4
    //   106: ldc 64
    //   108: aload 6
    //   110: ldc -122
    //   112: iconst_0
    //   113: anewarray 4	java/lang/Object
    //   116: invokestatic 209	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   119: aload 5
    //   121: ifnull +91 -> 212
    //   124: aload 5
    //   126: invokevirtual 459	android/graphics/BitmapRegionDecoder:recycle	()V
    //   129: aconst_null
    //   130: astore 4
    //   132: goto -75 -> 57
    //   135: astore_0
    //   136: aconst_null
    //   137: astore 4
    //   139: aload 4
    //   141: ifnull +8 -> 149
    //   144: aload 4
    //   146: invokevirtual 459	android/graphics/BitmapRegionDecoder:recycle	()V
    //   149: aload_0
    //   150: athrow
    //   151: ldc 64
    //   153: ldc_w 461
    //   156: invokestatic 441	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   159: new 172	java/io/FileInputStream
    //   162: dup
    //   163: aload_0
    //   164: invokespecial 444	java/io/FileInputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   167: astore 4
    //   169: aload 4
    //   171: aload_1
    //   172: aload_2
    //   173: aload_3
    //   174: invokestatic 465	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeRegionFallback	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Landroid/graphics/Bitmap;
    //   177: astore_0
    //   178: aload 4
    //   180: invokestatic 203	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   183: goto -97 -> 86
    //   186: astore_0
    //   187: aload 7
    //   189: astore_1
    //   190: aload_1
    //   191: invokestatic 203	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   194: aload_0
    //   195: athrow
    //   196: astore_0
    //   197: aload 4
    //   199: astore_1
    //   200: goto -10 -> 190
    //   203: astore_0
    //   204: goto -65 -> 139
    //   207: astore 6
    //   209: goto -107 -> 102
    //   212: aconst_null
    //   213: astore 4
    //   215: goto -158 -> 57
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	218	0	paramFileDescriptor	FileDescriptor
    //   0	218	1	paramRect	Rect
    //   0	218	2	paramOptions	BitmapFactory.Options
    //   0	218	3	paramDecodeResultLogger	DecodeResultLogger
    //   28	186	4	localObject1	Object
    //   24	101	5	localBitmapRegionDecoder	android.graphics.BitmapRegionDecoder
    //   37	17	6	localBitmap	Bitmap
    //   97	12	6	localException1	Exception
    //   207	1	6	localException2	Exception
    //   1	187	7	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   19	26	97	java/lang/Exception
    //   19	26	135	finally
    //   159	169	186	finally
    //   169	178	196	finally
    //   30	39	203	finally
    //   106	119	203	finally
    //   30	39	207	java/lang/Exception
  }
  
  /* Error */
  public static Bitmap decodeRegion(InputStream paramInputStream, Rect paramRect, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger)
  {
    // Byte code:
    //   0: ldc2_w 466
    //   3: ldc_w 468
    //   6: invokestatic 79	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_2
    //   10: invokestatic 434	com/tencent/mm/sdk/platformtools/MMBitmapFactory:checkIfHaveToUseMMDecoder	(Landroid/graphics/BitmapFactory$Options;)Z
    //   13: ifne +159 -> 172
    //   16: aload_0
    //   17: iconst_1
    //   18: invokestatic 471	android/graphics/BitmapRegionDecoder:newInstance	(Ljava/io/InputStream;Z)Landroid/graphics/BitmapRegionDecoder;
    //   21: astore 5
    //   23: aload 5
    //   25: astore 4
    //   27: aload 5
    //   29: aload_1
    //   30: aload_2
    //   31: invokevirtual 458	android/graphics/BitmapRegionDecoder:decodeRegion	(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   34: astore 6
    //   36: aload 5
    //   38: ifnull +140 -> 178
    //   41: aload 5
    //   43: invokevirtual 459	android/graphics/BitmapRegionDecoder:recycle	()V
    //   46: aload 6
    //   48: astore 4
    //   50: aload 4
    //   52: ifnull +92 -> 144
    //   55: aload 4
    //   57: astore_0
    //   58: aload_3
    //   59: ifnull +20 -> 79
    //   62: aload_3
    //   63: invokevirtual 379	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:clear	()V
    //   66: aload_3
    //   67: iconst_0
    //   68: putfield 168	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:mDecodeResultCode	I
    //   71: aload_3
    //   72: iconst_0
    //   73: putfield 330	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:mIsDecodeByMMDecoder	Z
    //   76: aload 4
    //   78: astore_0
    //   79: ldc2_w 466
    //   82: ldc_w 468
    //   85: invokestatic 93	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   88: aload_0
    //   89: areturn
    //   90: astore 6
    //   92: aconst_null
    //   93: astore 5
    //   95: aload 5
    //   97: astore 4
    //   99: ldc 64
    //   101: aload 6
    //   103: ldc -122
    //   105: iconst_0
    //   106: anewarray 4	java/lang/Object
    //   109: invokestatic 209	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   112: aload 5
    //   114: ifnull +58 -> 172
    //   117: aload 5
    //   119: invokevirtual 459	android/graphics/BitmapRegionDecoder:recycle	()V
    //   122: aconst_null
    //   123: astore 4
    //   125: goto -75 -> 50
    //   128: astore_0
    //   129: aconst_null
    //   130: astore 4
    //   132: aload 4
    //   134: ifnull +8 -> 142
    //   137: aload 4
    //   139: invokevirtual 459	android/graphics/BitmapRegionDecoder:recycle	()V
    //   142: aload_0
    //   143: athrow
    //   144: ldc 64
    //   146: ldc_w 473
    //   149: invokestatic 441	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   152: aload_0
    //   153: aload_1
    //   154: aload_2
    //   155: aload_3
    //   156: invokestatic 465	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeRegionFallback	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Landroid/graphics/Bitmap;
    //   159: astore_0
    //   160: goto -81 -> 79
    //   163: astore_0
    //   164: goto -32 -> 132
    //   167: astore 6
    //   169: goto -74 -> 95
    //   172: aconst_null
    //   173: astore 4
    //   175: goto -125 -> 50
    //   178: aload 6
    //   180: astore 4
    //   182: goto -132 -> 50
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	185	0	paramInputStream	InputStream
    //   0	185	1	paramRect	Rect
    //   0	185	2	paramOptions	BitmapFactory.Options
    //   0	185	3	paramDecodeResultLogger	DecodeResultLogger
    //   25	156	4	localObject	Object
    //   21	97	5	localBitmapRegionDecoder	android.graphics.BitmapRegionDecoder
    //   34	13	6	localBitmap	Bitmap
    //   90	12	6	localException1	Exception
    //   167	12	6	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   16	23	90	java/lang/Exception
    //   16	23	128	finally
    //   27	36	163	finally
    //   99	112	163	finally
    //   27	36	167	java/lang/Exception
  }
  
  /* Error */
  public static Bitmap decodeRegion(byte[] paramArrayOfByte, int paramInt1, int paramInt2, Rect paramRect, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger)
  {
    // Byte code:
    //   0: ldc2_w 475
    //   3: ldc_w 477
    //   6: invokestatic 79	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload 4
    //   11: invokestatic 434	com/tencent/mm/sdk/platformtools/MMBitmapFactory:checkIfHaveToUseMMDecoder	(Landroid/graphics/BitmapFactory$Options;)Z
    //   14: ifne +170 -> 184
    //   17: aload_0
    //   18: iload_1
    //   19: iload_2
    //   20: iconst_1
    //   21: invokestatic 480	android/graphics/BitmapRegionDecoder:newInstance	([BIIZ)Landroid/graphics/BitmapRegionDecoder;
    //   24: astore 7
    //   26: aload 7
    //   28: astore 6
    //   30: aload 7
    //   32: aload_3
    //   33: aload 4
    //   35: invokevirtual 458	android/graphics/BitmapRegionDecoder:decodeRegion	(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   38: astore 8
    //   40: aload 7
    //   42: ifnull +148 -> 190
    //   45: aload 7
    //   47: invokevirtual 459	android/graphics/BitmapRegionDecoder:recycle	()V
    //   50: aload 8
    //   52: astore 6
    //   54: aload 6
    //   56: ifnull +96 -> 152
    //   59: aload 6
    //   61: astore_0
    //   62: aload 5
    //   64: ifnull +23 -> 87
    //   67: aload 5
    //   69: invokevirtual 379	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:clear	()V
    //   72: aload 5
    //   74: iconst_0
    //   75: putfield 168	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:mDecodeResultCode	I
    //   78: aload 5
    //   80: iconst_0
    //   81: putfield 330	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:mIsDecodeByMMDecoder	Z
    //   84: aload 6
    //   86: astore_0
    //   87: ldc2_w 475
    //   90: ldc_w 477
    //   93: invokestatic 93	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   96: aload_0
    //   97: areturn
    //   98: astore 8
    //   100: aconst_null
    //   101: astore 7
    //   103: aload 7
    //   105: astore 6
    //   107: ldc 64
    //   109: aload 8
    //   111: ldc -122
    //   113: iconst_0
    //   114: anewarray 4	java/lang/Object
    //   117: invokestatic 209	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   120: aload 7
    //   122: ifnull +62 -> 184
    //   125: aload 7
    //   127: invokevirtual 459	android/graphics/BitmapRegionDecoder:recycle	()V
    //   130: aconst_null
    //   131: astore 6
    //   133: goto -79 -> 54
    //   136: astore_0
    //   137: aconst_null
    //   138: astore 6
    //   140: aload 6
    //   142: ifnull +8 -> 150
    //   145: aload 6
    //   147: invokevirtual 459	android/graphics/BitmapRegionDecoder:recycle	()V
    //   150: aload_0
    //   151: athrow
    //   152: ldc 64
    //   154: ldc_w 482
    //   157: invokestatic 441	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   160: aload_0
    //   161: iload_1
    //   162: iload_2
    //   163: aload_3
    //   164: aload 4
    //   166: aload 5
    //   168: invokestatic 484	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeRegionFallback	([BIILandroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Landroid/graphics/Bitmap;
    //   171: astore_0
    //   172: goto -85 -> 87
    //   175: astore_0
    //   176: goto -36 -> 140
    //   179: astore 8
    //   181: goto -78 -> 103
    //   184: aconst_null
    //   185: astore 6
    //   187: goto -133 -> 54
    //   190: aload 8
    //   192: astore 6
    //   194: goto -140 -> 54
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	197	0	paramArrayOfByte	byte[]
    //   0	197	1	paramInt1	int
    //   0	197	2	paramInt2	int
    //   0	197	3	paramRect	Rect
    //   0	197	4	paramOptions	BitmapFactory.Options
    //   0	197	5	paramDecodeResultLogger	DecodeResultLogger
    //   28	165	6	localObject	Object
    //   24	102	7	localBitmapRegionDecoder	android.graphics.BitmapRegionDecoder
    //   38	13	8	localBitmap	Bitmap
    //   98	12	8	localException1	Exception
    //   179	12	8	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   17	26	98	java/lang/Exception
    //   17	26	136	finally
    //   30	40	175	finally
    //   107	120	175	finally
    //   30	40	179	java/lang/Exception
  }
  
  private static Bitmap decodeRegionFallback(InputStream paramInputStream, Rect paramRect, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger)
  {
    GMTrace.i(13765907054592L, 102564);
    paramInputStream = decodeStream(paramInputStream, null, paramOptions, paramDecodeResultLogger, 0, new int[0]);
    if (paramInputStream != null)
    {
      paramRect = Bitmap.createBitmap(paramInputStream, paramRect.left, paramRect.top, paramRect.right - paramRect.left, paramRect.bottom - paramRect.top);
      if (paramRect != paramInputStream) {
        paramInputStream.recycle();
      }
      GMTrace.o(13765907054592L, 102564);
      return paramRect;
    }
    GMTrace.o(13765907054592L, 102564);
    return null;
  }
  
  private static Bitmap decodeRegionFallback(byte[] paramArrayOfByte, int paramInt1, int paramInt2, Rect paramRect, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger)
  {
    GMTrace.i(13766041272320L, 102565);
    paramArrayOfByte = decodeByteArray(paramArrayOfByte, paramInt1, paramInt2, paramOptions, paramDecodeResultLogger, 0, new int[0]);
    if (paramArrayOfByte != null)
    {
      paramRect = Bitmap.createBitmap(paramArrayOfByte, paramRect.left, paramRect.top, paramRect.right - paramRect.left, paramRect.bottom - paramRect.top);
      if (paramRect != paramArrayOfByte) {
        paramArrayOfByte.recycle();
      }
      GMTrace.o(13766041272320L, 102565);
      return paramRect;
    }
    GMTrace.o(13766041272320L, 102565);
    return null;
  }
  
  public static Bitmap decodeStream(InputStream paramInputStream)
  {
    GMTrace.i(13763893788672L, 102549);
    paramInputStream = decodeStream(paramInputStream, null, null, null, 1, new int[0]);
    GMTrace.o(13763893788672L, 102549);
    return paramInputStream;
  }
  
  public static Bitmap decodeStream(InputStream paramInputStream, int paramInt)
  {
    GMTrace.i(13764028006400L, 102550);
    paramInputStream = decodeStream(paramInputStream, null, null, null, paramInt, new int[0]);
    GMTrace.o(13764028006400L, 102550);
    return paramInputStream;
  }
  
  public static Bitmap decodeStream(InputStream paramInputStream, Rect paramRect, BitmapFactory.Options paramOptions)
  {
    GMTrace.i(13764162224128L, 102551);
    paramInputStream = decodeStream(paramInputStream, paramRect, paramOptions, null, 1, new int[0]);
    GMTrace.o(13764162224128L, 102551);
    return paramInputStream;
  }
  
  public static Bitmap decodeStream(InputStream paramInputStream, Rect paramRect, BitmapFactory.Options paramOptions, int paramInt)
  {
    GMTrace.i(13764296441856L, 102552);
    paramInputStream = decodeStream(paramInputStream, paramRect, paramOptions, null, paramInt, new int[0]);
    GMTrace.o(13764296441856L, 102552);
    return paramInputStream;
  }
  
  public static Bitmap decodeStream(InputStream paramInputStream, Rect paramRect, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger, int paramInt, int... paramVarArgs)
  {
    GMTrace.i(13764699095040L, 102555);
    long l2 = System.currentTimeMillis();
    try
    {
      int i = paramInputStream.available();
      l1 = i;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        long l1 = -1L;
      }
    }
    paramInputStream = decodeStreamInternal(paramInputStream, paramRect, paramOptions, paramDecodeResultLogger, paramInt, paramVarArgs);
    w.i("MicroMsg.MMBitmapFactory", "decode done, size:%d, cost:%d ms", new Object[] { Long.valueOf(l1), Long.valueOf(System.currentTimeMillis() - l2) });
    GMTrace.o(13764699095040L, 102555);
    return paramInputStream;
  }
  
  public static Bitmap decodeStream(InputStream paramInputStream, DecodeResultLogger paramDecodeResultLogger)
  {
    GMTrace.i(13764430659584L, 102553);
    paramInputStream = decodeStream(paramInputStream, null, null, paramDecodeResultLogger, 1, new int[0]);
    GMTrace.o(13764430659584L, 102553);
    return paramInputStream;
  }
  
  public static Bitmap decodeStream(InputStream paramInputStream, DecodeResultLogger paramDecodeResultLogger, int paramInt, int... paramVarArgs)
  {
    GMTrace.i(13764564877312L, 102554);
    paramInputStream = decodeStream(paramInputStream, null, null, paramDecodeResultLogger, paramInt, paramVarArgs);
    GMTrace.o(13764564877312L, 102554);
    return paramInputStream;
  }
  
  private static Bitmap decodeStreamInternal(InputStream paramInputStream, Rect paramRect, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger, int paramInt, int... paramVarArgs)
  {
    GMTrace.i(13764833312768L, 102556);
    checkIsInit();
    boolean bool = DynamicConfigStorage.getValue(DynamicConfigStorage.PREF_KEY_IS_ENABLE_MM_BITMAP_FACTORY, false);
    if ((bool) && (!(paramInputStream instanceof AssetManager.AssetInputStream))) {
      switch (paramInt)
      {
      default: 
        w.i("MicroMsg.MMBitmapFactory", "Decoded by system BitmapFactory directly, isEnabled:%b", new Object[] { Boolean.valueOf(bool) });
        paramInputStream = decodeStreamWithSystemDecoder(paramInputStream, paramRect, paramOptions, paramDecodeResultLogger);
      }
    }
    for (;;)
    {
      GMTrace.o(13764833312768L, 102556);
      return paramInputStream;
      paramInputStream = decodeStreamWithMMDecoderIfPossible(paramInputStream, paramRect, paramOptions, paramDecodeResultLogger, paramVarArgs);
      continue;
      w.i("MicroMsg.MMBitmapFactory", "Decoded by system BitmapFactory directly, isEnabled:%b", new Object[] { Boolean.valueOf(bool) });
      paramInputStream = decodeStreamWithSystemDecoder(paramInputStream, paramRect, paramOptions, paramDecodeResultLogger);
    }
  }
  
  private static Bitmap decodeStreamWithMMDecoderIfPossible(InputStream paramInputStream, Rect paramRect, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger, int... paramVarArgs)
  {
    GMTrace.i(13764967530496L, 102557);
    Object localObject1 = null;
    if (paramOptions != null) {
      localObject1 = paramOptions.inTempStorage;
    }
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = new byte[' '];
    }
    if (!paramInputStream.markSupported())
    {
      if ((paramInputStream instanceof FileInputStream)) {
        localObject1 = new i((FileInputStream)paramInputStream);
      }
      for (;;)
      {
        try
        {
          ((InputStream)localObject1).mark(8388608);
          if (paramDecodeResultLogger != null) {
            continue;
          }
          paramInputStream = new DecodeResultLogger();
          paramDecodeResultLogger = paramInputStream;
        }
        catch (IOException paramRect)
        {
          label223:
          paramInputStream = null;
          continue;
          continue;
        }
        try
        {
          paramVarArgs = nativeDecodeStream((InputStream)localObject1, (byte[])localObject2, paramRect, paramOptions, paramDecodeResultLogger, paramVarArgs);
          paramInputStream = paramVarArgs;
          try
          {
            if (paramDecodeResultLogger.mDecodeResultCode == 0) {
              continue;
            }
            paramInputStream = paramVarArgs;
            if (paramDecodeResultLogger.mDecodeResultCode >= 2000) {
              continue;
            }
            paramInputStream = paramVarArgs;
            w.i("MicroMsg.MMBitmapFactory", "mmimgdec decoder decodes failed, try system BitmapFactory.");
            paramInputStream = paramVarArgs;
            paramDecodeResultLogger.mIsDecodeByMMDecoder = false;
            paramInputStream = paramVarArgs;
            ((InputStream)localObject1).reset();
            paramInputStream = paramVarArgs;
            ((InputStream)localObject1).mark(8388608);
            paramInputStream = paramVarArgs;
            paramRect = BitmapFactory.decodeStream((InputStream)localObject1, paramRect, paramOptions);
            if (paramRect == null)
            {
              if (paramOptions != null)
              {
                paramInputStream = paramRect;
                if (paramOptions.inJustDecodeBounds)
                {
                  paramInputStream = paramRect;
                  if (paramOptions.outWidth >= 0)
                  {
                    paramInputStream = paramRect;
                    if (paramOptions.outHeight < 0) {}
                  }
                }
              }
            }
            else
            {
              paramInputStream = paramRect;
              w.i("MicroMsg.MMBitmapFactory", "System decoder decodes success.");
              paramInputStream = paramRect;
              paramDecodeResultLogger.mDecodeResultCode = 0;
              paramInputStream = paramRect;
              ((InputStream)localObject1).reset();
              paramInputStream = paramRect;
              ((InputStream)localObject1).mark(8388608);
              paramInputStream = paramRect;
              w.i("MicroMsg.MMBitmapFactory", paramDecodeResultLogger.toLogString());
              GMTrace.o(13764967530496L, 102557);
              return paramInputStream;
              localObject1 = new BufferedInputStream(paramInputStream);
              continue;
            }
            paramInputStream = paramRect;
            w.w("MicroMsg.MMBitmapFactory", "System decoder decodes failed.");
            paramInputStream = paramRect;
            paramDecodeResultLogger.mDecodeResultCode = 1006;
            continue;
            w.printErrStackTrace("MicroMsg.MMBitmapFactory", paramRect, "An exception was thrown when decode image.", new Object[0]);
          }
          catch (IOException paramRect) {}
        }
        catch (IOException paramRect)
        {
          paramInputStream = null;
          continue;
        }
        paramDecodeResultLogger.mDecodeResultCode = 1005;
        continue;
        paramInputStream = paramVarArgs;
        w.i("MicroMsg.MMBitmapFactory", "decoder [%s] decodes done, ret:%d.", new Object[] { paramDecodeResultLogger.mDecoderTag, Integer.valueOf(paramDecodeResultLogger.mDecodeResultCode) });
        paramRect = paramVarArgs;
        if (paramVarArgs != null)
        {
          paramRect = paramVarArgs;
          if (paramOptions != null)
          {
            paramInputStream = paramVarArgs;
            paramRect = paramVarArgs;
            if (paramOptions.inScaled)
            {
              paramInputStream = paramVarArgs;
              paramRect = paramVarArgs;
              if (!paramOptions.inJustDecodeBounds)
              {
                paramInputStream = paramVarArgs;
                paramRect = getScaledBitmap(paramVarArgs, paramOptions);
                if (paramRect == paramVarArgs) {
                  break label451;
                }
                paramInputStream = paramVarArgs;
                paramVarArgs.recycle();
                break label451;
              }
            }
          }
        }
      }
    }
    label451:
    for (;;)
    {
      paramInputStream = paramRect;
      setDensityFromOptions(paramRect, paramOptions);
      break label223;
      localObject1 = paramInputStream;
      break;
    }
  }
  
  private static Bitmap decodeStreamWithSystemDecoder(InputStream paramInputStream, Rect paramRect, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger)
  {
    GMTrace.i(13765101748224L, 102558);
    paramRect = BitmapFactory.decodeStream(paramInputStream, paramRect, paramOptions);
    int i;
    if (paramDecodeResultLogger != null)
    {
      paramDecodeResultLogger.clear();
      if (paramRect != null)
      {
        i = 0;
        paramDecodeResultLogger.mDecodeResultCode = i;
        paramDecodeResultLogger.mIsDecodeByMMDecoder = false;
      }
    }
    else
    {
      if (paramRect == null) {
        break label86;
      }
    }
    label86:
    for (paramInputStream = paramRect.toString();; paramInputStream = "null")
    {
      w.i("MicroMsg.MMBitmapFactory", "decode stream by system decoder done, res: %s", new Object[] { paramInputStream });
      GMTrace.o(13765101748224L, 102558);
      return paramRect;
      i = 1006;
      break;
    }
  }
  
  private static Bitmap getScaledBitmap(Bitmap paramBitmap, BitmapFactory.Options paramOptions)
  {
    GMTrace.i(13765235965952L, 102559);
    int i = paramOptions.inDensity;
    int j = paramOptions.inTargetDensity;
    int k = paramOptions.inScreenDensity;
    if ((i != 0) && (j != 0) && (i != k)) {}
    for (float f = j / i;; f = 1.0F)
    {
      if (f != 1.0F) {}
      for (i = 1;; i = 0)
      {
        paramOptions = paramBitmap;
        if (i != 0) {
          paramOptions = Bitmap.createScaledBitmap(paramBitmap, (int)(paramBitmap.getWidth() * f + 0.5F), (int)(f * paramBitmap.getHeight() + 0.5F), true);
        }
        GMTrace.o(13765235965952L, 102559);
        return paramOptions;
      }
    }
  }
  
  public static boolean init()
  {
    GMTrace.i(13760135692288L, 102521);
    if (m.sR()) {
      d.u(ab.getContext(), "libvoipCodec_v7a.so");
    }
    boolean bool = nativeInit(new String[] { new File(ab.getContext().getDir("lib", 0), "libvoipCodec_v7a.so").getAbsolutePath() });
    mIsInit = bool;
    if (!bool)
    {
      DynamicConfigStorage.setValue(DynamicConfigStorage.PREF_KEY_IS_ENABLE_MM_BITMAP_FACTORY, false);
      w.w("MicroMsg.MMBitmapFactory", "MMBitmapFactory initialize failed, force use system BitmapFactory instead.");
    }
    bool = mIsInit;
    GMTrace.o(13760135692288L, 102521);
    return bool;
  }
  
  private static native int nativeCheckIsImageLegal(InputStream paramInputStream, byte[] paramArrayOfByte, DecodeResultLogger paramDecodeResultLogger);
  
  private static native Bitmap nativeDecodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger, int... paramVarArgs);
  
  private static native Bitmap nativeDecodeStream(InputStream paramInputStream, byte[] paramArrayOfByte, Rect paramRect, BitmapFactory.Options paramOptions, DecodeResultLogger paramDecodeResultLogger, int... paramVarArgs);
  
  private static native boolean nativeInit(String... paramVarArgs);
  
  private static native int nativePinBitmap(Bitmap paramBitmap);
  
  private static native boolean nativeSwitchDecoder(int paramInt, boolean paramBoolean);
  
  private static native int nativeUnPinBitmap(Bitmap paramBitmap);
  
  public static Bitmap pinBitmap(Bitmap paramBitmap)
  {
    GMTrace.i(13766443925504L, 102568);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()) && (nativePinBitmap(paramBitmap) < 0)) {
      w.e("MicroMsg.MMBitmapFactory", "pinBitmap failed");
    }
    GMTrace.o(13766443925504L, 102568);
    return paramBitmap;
  }
  
  private static void setDensityFromOptions(Bitmap paramBitmap, BitmapFactory.Options paramOptions)
  {
    int i = 1;
    GMTrace.i(13765370183680L, 102560);
    if ((paramBitmap == null) || (paramOptions == null))
    {
      GMTrace.o(13765370183680L, 102560);
      return;
    }
    int k = paramOptions.inDensity;
    if (k != 0)
    {
      paramBitmap.setDensity(k);
      int j = paramOptions.inTargetDensity;
      if ((j == 0) || (k == j) || (k == paramOptions.inScreenDensity))
      {
        GMTrace.o(13765370183680L, 102560);
        return;
      }
      byte[] arrayOfByte = paramBitmap.getNinePatchChunk();
      if ((arrayOfByte != null) && (NinePatch.isNinePatchChunk(arrayOfByte))) {}
      for (;;)
      {
        if ((paramOptions.inScaled) || (i != 0)) {
          paramBitmap.setDensity(j);
        }
        GMTrace.o(13765370183680L, 102560);
        return;
        i = 0;
      }
    }
    if (paramOptions.inBitmap != null) {
      try
      {
        if (mMthGetDefaultDensity == null)
        {
          paramOptions = Bitmap.class.getDeclaredMethod("getDefaultDensity", null);
          mMthGetDefaultDensity = paramOptions;
          paramOptions.setAccessible(true);
        }
        paramBitmap.setDensity(((Integer)mMthGetDefaultDensity.invoke(null, new Object[0])).intValue());
        GMTrace.o(13765370183680L, 102560);
        return;
      }
      catch (Exception paramOptions)
      {
        paramBitmap.setDensity(160);
      }
    }
    GMTrace.o(13765370183680L, 102560);
  }
  
  public static void setUseMMBitmapFactory(boolean paramBoolean)
  {
    GMTrace.i(13760269910016L, 102522);
    if (mIsInit)
    {
      DynamicConfigStorage.setValue(DynamicConfigStorage.PREF_KEY_IS_ENABLE_MM_BITMAP_FACTORY, paramBoolean);
      if (!paramBoolean) {
        w.i("MicroMsg.MMBitmapFactory", "MMBitmapFactory is switched off, use system BitmapFactory directly.");
      }
    }
    GMTrace.o(13760269910016L, 102522);
  }
  
  public static boolean switchDecoder(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(13760404127744L, 102523);
    paramBoolean = nativeSwitchDecoder(paramInt, paramBoolean);
    GMTrace.o(13760404127744L, 102523);
    return paramBoolean;
  }
  
  public static Bitmap unPinBitmap(Bitmap paramBitmap)
  {
    GMTrace.i(13766578143232L, 102569);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()) && (nativeUnPinBitmap(paramBitmap) < 0)) {
      w.e("MicroMsg.MMBitmapFactory", "unpinBitmap failed");
    }
    GMTrace.o(13766578143232L, 102569);
    return paramBitmap;
  }
  
  public static class DecodeResultLogger
  {
    public int mDecodeResultCode;
    public String mDecoderTag;
    public boolean mIsDecodeByMMDecoder;
    
    public DecodeResultLogger()
    {
      GMTrace.i(13748056096768L, 102431);
      this.mDecoderTag = null;
      clear();
      GMTrace.o(13748056096768L, 102431);
    }
    
    private void fillerForNative(int paramInt, boolean paramBoolean, String paramString)
    {
      GMTrace.i(13748190314496L, 102432);
      this.mDecodeResultCode = paramInt;
      this.mIsDecodeByMMDecoder = paramBoolean;
      String str;
      if (paramString != null)
      {
        str = paramString;
        if (paramString.length() != 0) {}
      }
      else
      {
        str = "System";
      }
      this.mDecoderTag = str;
      GMTrace.o(13748190314496L, 102432);
    }
    
    public void clear()
    {
      GMTrace.i(13748861403136L, 102437);
      this.mDecodeResultCode = 0;
      this.mIsDecodeByMMDecoder = false;
      this.mDecoderTag = "System";
      GMTrace.o(13748861403136L, 102437);
    }
    
    public int getDecodeResult()
    {
      GMTrace.i(13748324532224L, 102433);
      int i = this.mDecodeResultCode;
      GMTrace.o(13748324532224L, 102433);
      return i;
    }
    
    public String getDecoderTag()
    {
      GMTrace.i(13748727185408L, 102436);
      String str = this.mDecoderTag;
      GMTrace.o(13748727185408L, 102436);
      return str;
    }
    
    public boolean isDecodeByMMDecoder()
    {
      GMTrace.i(13748592967680L, 102435);
      boolean bool = this.mIsDecodeByMMDecoder;
      GMTrace.o(13748592967680L, 102435);
      return bool;
    }
    
    public void setDecodeResult(int paramInt)
    {
      GMTrace.i(13748458749952L, 102434);
      this.mDecodeResultCode = paramInt;
      GMTrace.o(13748458749952L, 102434);
    }
    
    public String toLogString()
    {
      GMTrace.i(13748995620864L, 102438);
      String str = String.format("%d,%b,%s,%s", new Object[] { Integer.valueOf(this.mDecodeResultCode), Boolean.valueOf(this.mIsDecodeByMMDecoder), this.mDecoderTag, "-" });
      GMTrace.o(13748995620864L, 102438);
      return str;
    }
    
    public String toString()
    {
      GMTrace.i(13749129838592L, 102439);
      String str = String.format("{%d,%b,%s}", new Object[] { Integer.valueOf(this.mDecodeResultCode), Boolean.valueOf(this.mIsDecodeByMMDecoder), this.mDecoderTag });
      GMTrace.o(13749129838592L, 102439);
      return str;
    }
  }
  
  private static class DynamicConfigStorage
  {
    public static String PREF_KEY_IS_ENABLE_MM_BITMAP_FACTORY;
    private static final String PREF_NAME = "pref_MMBitmapFactory_dyncfg";
    private static SharedPreferences mPref;
    
    static
    {
      GMTrace.i(13744566435840L, 102405);
      mPref = al.ba(ab.getContext(), "pref_MMBitmapFactory_dyncfg");
      PREF_KEY_IS_ENABLE_MM_BITMAP_FACTORY = "pref_key_is_enable_MMBitmapFactory";
      GMTrace.o(13744566435840L, 102405);
    }
    
    private DynamicConfigStorage()
    {
      GMTrace.i(13744029564928L, 102401);
      GMTrace.o(13744029564928L, 102401);
    }
    
    public static boolean getValue(String paramString, boolean paramBoolean)
    {
      GMTrace.i(13744298000384L, 102403);
      reload();
      if (mPref == null)
      {
        w.w("MicroMsg.MMBitmapFactory", "SharedPreferences in DynamicConfigStorage initialize failed.");
        GMTrace.o(13744298000384L, 102403);
        return paramBoolean;
      }
      paramBoolean = mPref.getBoolean(paramString, paramBoolean);
      w.d("MicroMsg.MMBitmapFactory", "DynamicConfigStorage, getValue:%b", new Object[] { Boolean.valueOf(paramBoolean) });
      GMTrace.o(13744298000384L, 102403);
      return paramBoolean;
    }
    
    private static void reload()
    {
      GMTrace.i(13744163782656L, 102402);
      mPref = al.ba(ab.getContext(), "pref_MMBitmapFactory_dyncfg");
      GMTrace.o(13744163782656L, 102402);
    }
    
    public static void setValue(String paramString, boolean paramBoolean)
    {
      GMTrace.i(13744432218112L, 102404);
      if (mPref == null)
      {
        w.w("MicroMsg.MMBitmapFactory", "SharedPreferences in DynamicConfigStorage initialize failed.");
        GMTrace.o(13744432218112L, 102404);
        return;
      }
      SharedPreferences.Editor localEditor = mPref.edit();
      localEditor.putBoolean(paramString, paramBoolean);
      localEditor.commit();
      GMTrace.o(13744432218112L, 102404);
    }
  }
  
  public static class HEVCKVStatHelper
  {
    private static final String KVSTAT_STRING_SEPERATOR = ",";
    public static final int SCENE_SNS = 0;
    private static final long STAT_INTERVAL = 60000L;
    private static long mLastStatTick;
    
    static
    {
      GMTrace.i(13773557465088L, 102621);
      mLastStatTick = 0L;
      GMTrace.o(13773557465088L, 102621);
    }
    
    public HEVCKVStatHelper()
    {
      GMTrace.i(13773154811904L, 102618);
      GMTrace.o(13773154811904L, 102618);
    }
    
    public static String getKVStatString(Object paramObject, int paramInt, long paramLong, BitmapFactory.Options paramOptions, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger)
    {
      GMTrace.i(13773423247360L, 102620);
      StringBuilder localStringBuilder = new StringBuilder(128);
      long l2 = -1L;
      long l1;
      if ((paramObject instanceof File))
      {
        paramObject = (File)paramObject;
        l1 = l2;
        if (((File)paramObject).exists())
        {
          l1 = l2;
          if (((File)paramObject).isFile()) {
            l1 = ((File)paramObject).length();
          }
        }
      }
      for (;;)
      {
        localStringBuilder.append(paramInt).append(",").append(paramDecodeResultLogger.mDecodeResultCode).append(",").append(l1).append(",").append(paramLong).append(",").append(bg.nl(paramOptions.outMimeType));
        paramObject = localStringBuilder.toString();
        GMTrace.o(13773423247360L, 102620);
        return (String)paramObject;
        if ((paramObject instanceof String))
        {
          paramObject = (String)paramObject;
          l1 = l2;
          if (FileOp.aZ((String)paramObject)) {
            l1 = FileOp.kX((String)paramObject);
          }
        }
        else
        {
          l1 = l2;
          if ((paramObject instanceof byte[])) {
            l1 = ((byte[])paramObject).length;
          }
        }
      }
    }
    
    public static boolean isTimeToStat()
    {
      GMTrace.i(13773289029632L, 102619);
      long l = bg.Pw();
      if (l - mLastStatTick > 60000L)
      {
        mLastStatTick = l;
        GMTrace.o(13773289029632L, 102619);
        return true;
      }
      GMTrace.o(13773289029632L, 102619);
      return false;
    }
  }
  
  public static class KVStatHelper
  {
    private static final String KVSTAT_STRING_SEPERATOR = ",";
    public static final int MMBMPFACTORY_SCENE_ADDTOFAV = 5;
    public static final int MMBMPFACTORY_SCENE_APPMSG_DECODE = 9;
    public static final int MMBMPFACTORY_SCENE_APPMSG_TRANS = 6;
    public static final int MMBMPFACTORY_SCENE_GALLERY_BROWSE = 1;
    public static final int MMBMPFACTORY_SCENE_GET_MSGIMG = 2;
    public static final int MMBMPFACTORY_SCENE_IMGMSG_TRANS = 7;
    public static final int MMBMPFACTORY_SCENE_NONE = 0;
    public static final int MMBMPFACTORY_SCENE_OTHERS = 8;
    public static final int MMBMPFACTORY_SCENE_SHAREIMG = 3;
    public static final int MMBMPFACTORY_SCENE_SHARE_TO_TIMELINE = 4;
    public static final int MMBMPFACTORY_SCENE_SNS_IMGRECV = 10;
    
    public KVStatHelper()
    {
      GMTrace.i(13742955823104L, 102393);
      GMTrace.o(13742955823104L, 102393);
    }
    
    public static String getKVStatString(Object paramObject, int paramInt, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger)
    {
      GMTrace.i(13743090040832L, 102394);
      StringBuilder localStringBuilder = new StringBuilder(128);
      Object localObject2 = "";
      long l2 = -1L;
      Object localObject1;
      if ((paramObject instanceof File))
      {
        localObject1 = (File)paramObject;
        if ((!((File)localObject1).exists()) || (!((File)localObject1).isFile())) {
          break label332;
        }
        paramObject = bg.nl(g.h((File)localObject1));
      }
      for (long l1 = ((File)localObject1).length();; l1 = -1L)
      {
        localObject1 = paramObject;
        for (;;)
        {
          localStringBuilder.append(paramInt).append(",").append(paramDecodeResultLogger.mDecodeResultCode).append(",").append(l1).append(",").append((String)localObject1);
          paramObject = localStringBuilder.toString();
          GMTrace.o(13743090040832L, 102394);
          return (String)paramObject;
          if ((paramObject instanceof String))
          {
            String str2 = (String)paramObject;
            localObject1 = localObject2;
            l1 = l2;
            if (FileOp.aZ(str2))
            {
              localObject1 = null;
              try
              {
                paramObject = FileOp.openRead((String)paramObject);
                localObject1 = paramObject;
              }
              catch (FileNotFoundException paramObject)
              {
                String str1;
                paramObject = paramObject;
                paramObject = null;
                localObject1 = localObject2;
                l1 = l2;
                if (paramObject == null) {
                  continue;
                }
                try
                {
                  ((InputStream)paramObject).close();
                  localObject1 = localObject2;
                  l1 = l2;
                }
                catch (Exception paramObject)
                {
                  localObject1 = localObject2;
                  l1 = l2;
                }
                continue;
              }
              finally
              {
                if (localObject1 == null) {}
              }
            }
          }
          else
          {
            try
            {
              ((InputStream)localObject1).close();
              throw ((Throwable)paramObject);
              localObject1 = localObject2;
              l1 = l2;
              if ((paramObject instanceof byte[]))
              {
                paramObject = (byte[])paramObject;
                localObject1 = g.n((byte[])paramObject);
                l1 = paramObject.length;
              }
            }
            catch (Exception paramDecodeResultLogger)
            {
              for (;;) {}
            }
          }
        }
        label332:
        paramObject = "";
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\MMBitmapFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */