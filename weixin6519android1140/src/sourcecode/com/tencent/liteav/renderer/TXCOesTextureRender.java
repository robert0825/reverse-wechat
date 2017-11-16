package com.tencent.liteav.renderer;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class TXCOesTextureRender
{
  private static final int FLOAT_SIZE_BYTES = 4;
  public static final String FRAGMENT_SHADER_LOCAL = "varying highp vec2 vTextureCoord;\n \nuniform sampler2D sTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(sTexture, vTextureCoord);\n}";
  private static final String FRAGMENT_SHADER_OES = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
  private static final String TAG = "TXCOesTextureRender";
  private static final int TRIANGLE_VERTICES_DATA_POS_OFFSET = 0;
  private static final int TRIANGLE_VERTICES_DATA_STRIDE_BYTES = 20;
  private static final int TRIANGLE_VERTICES_DATA_UV_OFFSET = 3;
  private static final String VERTEX_SHADER = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
  private boolean mClearLastFrame = false;
  private boolean mIsOESTexture = true;
  private float[] mMVPMatrix = new float[16];
  private boolean mMirror = false;
  private int mOrientaion = -1;
  private int mProgram;
  private float[] mSTMatrix = new float[16];
  private int mTextureID = 53191;
  private FloatBuffer mTriangleVertices;
  private final float[] mTriangleVerticesDataLocal = { 1.0F, -1.0F, 0.0F, 1.0F, 1.0F, -1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.0F };
  private final float[] mTriangleVerticesDataOes = { -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F };
  private int maPositionHandle;
  private int maTextureHandle;
  private int muMVPMatrixHandle;
  private int muSTMatrixHandle;
  
  public TXCOesTextureRender(boolean paramBoolean)
  {
    this.mIsOESTexture = paramBoolean;
    if (this.mIsOESTexture)
    {
      this.mTriangleVertices = ByteBuffer.allocateDirect(this.mTriangleVerticesDataOes.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
      this.mTriangleVertices.put(this.mTriangleVerticesDataOes).position(0);
    }
    for (;;)
    {
      Matrix.setIdentityM(this.mSTMatrix, 0);
      return;
      this.mTriangleVertices = ByteBuffer.allocateDirect(this.mTriangleVerticesDataLocal.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
      this.mTriangleVertices.put(this.mTriangleVerticesDataLocal).position(0);
    }
  }
  
  private void createOESTexture()
  {
    int[] arrayOfInt = new int[1];
    GLES20.glGenTextures(1, arrayOfInt, 0);
    this.mTextureID = arrayOfInt[0];
    GLES20.glBindTexture(36197, this.mTextureID);
    checkGlError("glBindTexture mTextureID");
  }
  
  private int createProgram(String paramString1, String paramString2)
  {
    int i = loadShader(35633, paramString1);
    if (i == 0) {}
    int j;
    do
    {
      return 0;
      j = loadShader(35632, paramString2);
    } while (j == 0);
    int k = GLES20.glCreateProgram();
    checkGlError("glCreateProgram");
    if (k == 0) {
      TXCLog.e("TXCOesTextureRender", "Could not create program");
    }
    GLES20.glAttachShader(k, i);
    checkGlError("glAttachShader");
    GLES20.glAttachShader(k, j);
    checkGlError("glAttachShader");
    GLES20.glLinkProgram(k);
    paramString1 = new int[1];
    GLES20.glGetProgramiv(k, 35714, paramString1, 0);
    if (paramString1[0] != 1)
    {
      TXCLog.e("TXCOesTextureRender", "Could not link program: ");
      TXCLog.e("TXCOesTextureRender", GLES20.glGetProgramInfoLog(k));
      GLES20.glDeleteProgram(k);
      return 0;
    }
    return k;
  }
  
  private void drawFrame(int paramInt1, int paramInt2)
  {
    GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
    GLES20.glClear(16640);
    if (this.mClearLastFrame)
    {
      this.mClearLastFrame = false;
      return;
    }
    GLES20.glUseProgram(this.mProgram);
    checkGlError("glUseProgram");
    GLES20.glActiveTexture(33984);
    GLES20.glBindTexture(paramInt1, paramInt2);
    this.mTriangleVertices.position(0);
    GLES20.glVertexAttribPointer(this.maPositionHandle, 3, 5126, false, 20, this.mTriangleVertices);
    checkGlError("glVertexAttribPointer maPosition");
    GLES20.glEnableVertexAttribArray(this.maPositionHandle);
    checkGlError("glEnableVertexAttribArray maPositionHandle");
    this.mTriangleVertices.position(3);
    GLES20.glVertexAttribPointer(this.maTextureHandle, 2, 5126, false, 20, this.mTriangleVertices);
    checkGlError("glVertexAttribPointer maTextureHandle");
    GLES20.glEnableVertexAttribArray(this.maTextureHandle);
    checkGlError("glEnableVertexAttribArray maTextureHandle");
    Matrix.setIdentityM(this.mMVPMatrix, 0);
    GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle, 1, false, this.mMVPMatrix, 0);
    GLES20.glUniformMatrix4fv(this.muSTMatrixHandle, 1, false, this.mSTMatrix, 0);
    GLES20.glDrawArrays(5, 0, 4);
    checkGlError("glDrawArrays");
    GLES20.glFinish();
  }
  
  private int loadShader(int paramInt, String paramString)
  {
    int i = GLES20.glCreateShader(paramInt);
    checkGlError("glCreateShader type=" + paramInt);
    GLES20.glShaderSource(i, paramString);
    GLES20.glCompileShader(i);
    paramString = new int[1];
    GLES20.glGetShaderiv(i, 35713, paramString, 0);
    if (paramString[0] == 0)
    {
      TXCLog.e("TXCOesTextureRender", "Could not compile shader " + paramInt + ":");
      TXCLog.e("TXCOesTextureRender", " " + GLES20.glGetShaderInfoLog(i));
      GLES20.glDeleteShader(i);
      return 0;
    }
    return i;
  }
  
  /* Error */
  public static void saveFrame(String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: iload_1
    //   3: iload_2
    //   4: imul
    //   5: iconst_4
    //   6: imul
    //   7: invokestatic 74	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   10: astore 6
    //   12: aload 6
    //   14: getstatic 273	java/nio/ByteOrder:LITTLE_ENDIAN	Ljava/nio/ByteOrder;
    //   17: invokevirtual 84	java/nio/ByteBuffer:order	(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   20: pop
    //   21: iconst_0
    //   22: iconst_0
    //   23: iload_1
    //   24: iload_2
    //   25: sipush 6408
    //   28: sipush 5121
    //   31: aload 6
    //   33: invokestatic 277	android/opengl/GLES20:glReadPixels	(IIIIIILjava/nio/Buffer;)V
    //   36: aload 6
    //   38: invokevirtual 281	java/nio/ByteBuffer:rewind	()Ljava/nio/Buffer;
    //   41: pop
    //   42: iload_1
    //   43: iload_2
    //   44: imul
    //   45: istore 4
    //   47: iload 4
    //   49: newarray <illegal type>
    //   51: astore 8
    //   53: aload 6
    //   55: invokevirtual 285	java/nio/ByteBuffer:asIntBuffer	()Ljava/nio/IntBuffer;
    //   58: aload 8
    //   60: invokevirtual 291	java/nio/IntBuffer:get	([I)Ljava/nio/IntBuffer;
    //   63: pop
    //   64: iload_3
    //   65: iload 4
    //   67: if_icmpge +46 -> 113
    //   70: aload 8
    //   72: iload_3
    //   73: iaload
    //   74: istore 5
    //   76: aload 8
    //   78: iload_3
    //   79: iload 5
    //   81: sipush 255
    //   84: iand
    //   85: bipush 16
    //   87: ishl
    //   88: ldc_w 292
    //   91: iload 5
    //   93: iand
    //   94: ldc_w 293
    //   97: iload 5
    //   99: iand
    //   100: bipush 16
    //   102: ishr
    //   103: ior
    //   104: ior
    //   105: iastore
    //   106: iload_3
    //   107: iconst_1
    //   108: iadd
    //   109: istore_3
    //   110: goto -46 -> 64
    //   113: new 295	java/io/FileOutputStream
    //   116: dup
    //   117: aload_0
    //   118: invokespecial 296	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   121: astore 7
    //   123: aload 7
    //   125: astore 6
    //   127: aload 8
    //   129: iload_1
    //   130: iload_2
    //   131: getstatic 302	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   134: invokestatic 308	android/graphics/Bitmap:createBitmap	([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   137: astore 8
    //   139: aload 7
    //   141: astore 6
    //   143: aload 8
    //   145: getstatic 314	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   148: bipush 90
    //   150: aload 7
    //   152: invokevirtual 318	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   155: pop
    //   156: aload 7
    //   158: astore 6
    //   160: aload 8
    //   162: invokevirtual 321	android/graphics/Bitmap:recycle	()V
    //   165: aload 7
    //   167: invokevirtual 324	java/io/FileOutputStream:close	()V
    //   170: ldc 17
    //   172: new 227	java/lang/StringBuilder
    //   175: dup
    //   176: ldc_w 326
    //   179: invokespecial 231	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   182: iload_1
    //   183: invokevirtual 235	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   186: ldc_w 328
    //   189: invokevirtual 257	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: iload_2
    //   193: invokevirtual 235	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   196: ldc_w 330
    //   199: invokevirtual 257	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: aload_0
    //   203: invokevirtual 257	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: ldc_w 332
    //   209: invokevirtual 257	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: invokevirtual 239	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   215: invokestatic 335	com/tencent/liteav/basic/log/TXCLog:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   218: return
    //   219: astore 6
    //   221: new 337	java/lang/RuntimeException
    //   224: dup
    //   225: new 227	java/lang/StringBuilder
    //   228: dup
    //   229: ldc_w 339
    //   232: invokespecial 231	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   235: aload_0
    //   236: invokevirtual 257	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   239: invokevirtual 239	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   242: aload 6
    //   244: invokespecial 342	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   247: athrow
    //   248: astore 8
    //   250: aconst_null
    //   251: astore 6
    //   253: new 337	java/lang/RuntimeException
    //   256: dup
    //   257: new 227	java/lang/StringBuilder
    //   260: dup
    //   261: ldc_w 344
    //   264: invokespecial 231	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   267: aload_0
    //   268: invokevirtual 257	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   271: invokevirtual 239	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   274: aload 8
    //   276: invokespecial 342	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   279: athrow
    //   280: astore 8
    //   282: aload 6
    //   284: astore 7
    //   286: aload 8
    //   288: astore 6
    //   290: aload 7
    //   292: ifnull +8 -> 300
    //   295: aload 7
    //   297: invokevirtual 324	java/io/FileOutputStream:close	()V
    //   300: aload 6
    //   302: athrow
    //   303: astore 6
    //   305: new 337	java/lang/RuntimeException
    //   308: dup
    //   309: new 227	java/lang/StringBuilder
    //   312: dup
    //   313: ldc_w 339
    //   316: invokespecial 231	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   319: aload_0
    //   320: invokevirtual 257	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   323: invokevirtual 239	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   326: aload 6
    //   328: invokespecial 342	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   331: athrow
    //   332: astore 6
    //   334: aconst_null
    //   335: astore 7
    //   337: goto -47 -> 290
    //   340: astore 8
    //   342: aload 7
    //   344: astore 6
    //   346: goto -93 -> 253
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	349	0	paramString	String
    //   0	349	1	paramInt1	int
    //   0	349	2	paramInt2	int
    //   1	109	3	i	int
    //   45	23	4	j	int
    //   74	26	5	k	int
    //   10	149	6	localObject1	Object
    //   219	24	6	localIOException1	java.io.IOException
    //   251	50	6	localObject2	Object
    //   303	24	6	localIOException2	java.io.IOException
    //   332	1	6	localObject3	Object
    //   344	1	6	localObject4	Object
    //   121	222	7	localObject5	Object
    //   51	110	8	localObject6	Object
    //   248	27	8	localIOException3	java.io.IOException
    //   280	7	8	localObject7	Object
    //   340	1	8	localIOException4	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   165	170	219	java/io/IOException
    //   113	123	248	java/io/IOException
    //   127	139	280	finally
    //   143	156	280	finally
    //   160	165	280	finally
    //   253	280	280	finally
    //   295	300	303	java/io/IOException
    //   113	123	332	finally
    //   127	139	340	java/io/IOException
    //   143	156	340	java/io/IOException
    //   160	165	340	java/io/IOException
  }
  
  public void changeFragmentShader(String paramString)
  {
    GLES20.glDeleteProgram(this.mProgram);
    this.mProgram = createProgram("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", paramString);
    if (this.mProgram == 0) {
      throw new RuntimeException("failed creating program");
    }
  }
  
  public void checkGlError(String paramString)
  {
    int i = GLES20.glGetError();
    if (i != 0) {
      TXCLog.e("TXCOesTextureRender", paramString + ": glError " + i);
    }
  }
  
  public void clearLastFrame()
  {
    this.mClearLastFrame = true;
  }
  
  public void createTexture()
  {
    if (this.mIsOESTexture) {}
    for (this.mProgram = createProgram("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"); this.mProgram == 0; this.mProgram = createProgram("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "varying highp vec2 vTextureCoord;\n \nuniform sampler2D sTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(sTexture, vTextureCoord);\n}")) {
      throw new RuntimeException("failed creating program");
    }
    this.maPositionHandle = GLES20.glGetAttribLocation(this.mProgram, "aPosition");
    checkGlError("glGetAttribLocation aPosition");
    if (this.maPositionHandle == -1) {
      throw new RuntimeException("Could not get attrib location for aPosition");
    }
    this.maTextureHandle = GLES20.glGetAttribLocation(this.mProgram, "aTextureCoord");
    checkGlError("glGetAttribLocation aTextureCoord");
    if (this.maTextureHandle == -1) {
      throw new RuntimeException("Could not get attrib location for aTextureCoord");
    }
    this.muMVPMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uMVPMatrix");
    checkGlError("glGetUniformLocation uMVPMatrix");
    if (this.muMVPMatrixHandle == -1) {
      throw new RuntimeException("Could not get attrib location for uMVPMatrix");
    }
    this.muSTMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uSTMatrix");
    checkGlError("glGetUniformLocation uSTMatrix");
    if (this.muSTMatrixHandle == -1) {
      throw new RuntimeException("Could not get attrib location for uSTMatrix");
    }
    if (this.mIsOESTexture) {
      createOESTexture();
    }
    GLES20.glTexParameterf(36197, 10241, 9729.0F);
    GLES20.glTexParameterf(36197, 10240, 9729.0F);
    GLES20.glTexParameteri(36197, 10242, 33071);
    GLES20.glTexParameteri(36197, 10243, 33071);
    checkGlError("glTexParameter");
  }
  
  public void drawFrame(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    if ((this.mMirror != paramBoolean) || (this.mOrientaion != paramInt2))
    {
      this.mMirror = paramBoolean;
      this.mOrientaion = paramInt2;
      float[] arrayOfFloat = new float[20];
      int i = 0;
      while (i < 20)
      {
        arrayOfFloat[i] = this.mTriangleVerticesDataLocal[i];
        i += 1;
      }
      if (this.mMirror)
      {
        arrayOfFloat[0] = (-arrayOfFloat[0]);
        arrayOfFloat[5] = (-arrayOfFloat[5]);
        arrayOfFloat[10] = (-arrayOfFloat[10]);
        arrayOfFloat[15] = (-arrayOfFloat[15]);
      }
      i = paramInt2 / 90;
      paramInt2 = 0;
      while (paramInt2 < i)
      {
        float f1 = arrayOfFloat[3];
        float f2 = arrayOfFloat[4];
        arrayOfFloat[3] = arrayOfFloat[8];
        arrayOfFloat[4] = arrayOfFloat[9];
        arrayOfFloat[8] = arrayOfFloat[18];
        arrayOfFloat[9] = arrayOfFloat[19];
        arrayOfFloat[18] = arrayOfFloat[13];
        arrayOfFloat[19] = arrayOfFloat[14];
        arrayOfFloat[13] = f1;
        arrayOfFloat[14] = f2;
        paramInt2 += 1;
      }
      this.mTriangleVertices.clear();
      this.mTriangleVertices.put(arrayOfFloat).position(0);
    }
    drawFrame(3553, paramInt1);
  }
  
  public void drawFrame(int paramInt1, boolean paramBoolean, int paramInt2, float paramFloat, int paramInt3, int paramInt4)
  {
    float[] arrayOfFloat;
    int i;
    int j;
    if ((this.mMirror != paramBoolean) || (this.mOrientaion != paramInt2))
    {
      this.mMirror = paramBoolean;
      this.mOrientaion = paramInt2;
      arrayOfFloat = new float[20];
      i = 0;
      while (i < 20)
      {
        arrayOfFloat[i] = this.mTriangleVerticesDataLocal[i];
        i += 1;
      }
      if (this.mMirror)
      {
        arrayOfFloat[0] = (-arrayOfFloat[0]);
        arrayOfFloat[5] = (-arrayOfFloat[5]);
        arrayOfFloat[10] = (-arrayOfFloat[10]);
        arrayOfFloat[15] = (-arrayOfFloat[15]);
      }
      if (paramInt3 / paramInt4 > paramFloat)
      {
        j = (int)(paramInt4 * paramFloat);
        i = paramInt4;
      }
    }
    for (;;)
    {
      float f = j / paramInt3;
      paramFloat = i / paramInt4;
      f = (1.0F - f) / 2.0F;
      paramFloat = (1.0F - paramFloat) / 2.0F;
      paramInt3 = 0;
      label173:
      if (paramInt3 < 4)
      {
        if (arrayOfFloat[(paramInt3 * 5 + 3)] < 0.5F)
        {
          paramInt4 = paramInt3 * 5 + 3;
          arrayOfFloat[paramInt4] += f;
          label216:
          if (arrayOfFloat[(paramInt3 * 5 + 4)] >= 0.5F) {
            break label315;
          }
          paramInt4 = paramInt3 * 5 + 4;
          arrayOfFloat[paramInt4] += paramFloat;
        }
        for (;;)
        {
          paramInt3 += 1;
          break label173;
          if (paramInt3 / paramInt4 >= paramFloat) {
            break label475;
          }
          i = (int)(paramInt3 / paramFloat);
          j = paramInt3;
          break;
          paramInt4 = paramInt3 * 5 + 3;
          arrayOfFloat[paramInt4] -= f;
          break label216;
          label315:
          paramInt4 = paramInt3 * 5 + 4;
          arrayOfFloat[paramInt4] -= paramFloat;
        }
      }
      paramInt3 = paramInt2 / 90;
      paramInt2 = 0;
      while (paramInt2 < paramInt3)
      {
        paramFloat = arrayOfFloat[3];
        f = arrayOfFloat[4];
        arrayOfFloat[3] = arrayOfFloat[8];
        arrayOfFloat[4] = arrayOfFloat[9];
        arrayOfFloat[8] = arrayOfFloat[18];
        arrayOfFloat[9] = arrayOfFloat[19];
        arrayOfFloat[18] = arrayOfFloat[13];
        arrayOfFloat[19] = arrayOfFloat[14];
        arrayOfFloat[13] = paramFloat;
        arrayOfFloat[14] = f;
        paramInt2 += 1;
      }
      this.mTriangleVertices.clear();
      this.mTriangleVertices.put(arrayOfFloat).position(0);
      drawFrame(3553, paramInt1);
      return;
      label475:
      i = paramInt4;
      j = paramInt3;
    }
  }
  
  public void drawFrame(SurfaceTexture paramSurfaceTexture)
  {
    if (paramSurfaceTexture == null) {
      return;
    }
    checkGlError("onDrawFrame start");
    paramSurfaceTexture.getTransformMatrix(this.mSTMatrix);
    drawFrame(36197, this.mTextureID);
  }
  
  public int getTextureId()
  {
    return this.mTextureID;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\renderer\TXCOesTextureRender.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */