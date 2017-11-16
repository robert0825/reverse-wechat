package com.tencent.liteav.videoencoder;

import android.opengl.GLES20;
import com.tencent.liteav.basic.opengl.TXCGPUFilter;
import com.tencent.liteav.basic.opengl.TXCGPUFilter.OnFilterListener;
import com.tencent.liteav.basic.util.TXCSystemUtil;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

public class TXCSWVideoEncoder
  extends TXIVideoEncoder
{
  protected static final String FRAGMENT_SHADER_STR_RGB2YUV420P = "\nprecision highp float;\nvarying highp vec2 textureCoordinate;\nuniform highp sampler2D inputImageTexture;\t\t\t// 原始纹理\nuniform float width;\t\t\t// 纹理宽\nuniform float height;\t\t\t// 纹理高\n\nvoid main(void) {\n\tvec3 offset = vec3(0.0625, 0.5, 0.5);\n\tvec3 ycoeff = vec3(0.256816, 0.504154, 0.0979137);\n\tvec3 ucoeff = vec3(-0.148246, -0.29102, 0.439266);\n\tvec3 vcoeff = vec3(0.439271, -0.367833, -0.071438);\n\n\tvec2 nowTxtPos = textureCoordinate;\n\tvec2 size = vec2(width, height);\n\n\tfloat uvlines = height / 16.0;   // 0.625:w*h/4(uv数据所占内存空间) / w*h*4(rgba总空间) = 0.625(u或v数据在当前fbo中所占比例);uvlines:uv数据需要多少行\n\tfloat uvlinesI = float(int(uvlines));\n\tvec2 uvPosOffset = vec2(0.0,0.0625);\n\tvec2 uMaxPos = uvPosOffset+vec2(0,0.25);\n\tvec2 vMaxPos = uvPosOffset+uMaxPos;\n\n\tvec2 yScale = vec2(4.0,4.0);\n\tvec2 uvScale = vec2(8.0,8.0);\n// y\n\n\tif(nowTxtPos.y<0.25){\n// y base postion\n       vec2 basePos = nowTxtPos * yScale * size;\n       float addY = float(int((basePos.x / width)));\n       basePos.x -= addY * width;\n       basePos.y += addY;\n// y1 y2 y3 y4\n\t\tfloat y1,y2,y3,y4;\n\t\n\tbasePos.x -= 0.2;\n\tbasePos.y -= 0.2;\n\t\tvec2 samplingPos = basePos / size;\n\t\tvec4 texel = texture2D(inputImageTexture, samplingPos);\n\t\ty1 = dot(texel.rgb, ycoeff);\n\t\ty1 += offset.x;\n\t\n\t\tbasePos.x+=1.0;\n\t\tsamplingPos = basePos/ size;\n\t\ttexel = texture2D(inputImageTexture, samplingPos);\n\t\ty2 = dot(texel.rgb, ycoeff);\n\t\ty2 += offset.x;\n\n\t\n\t\tbasePos.x+=1.0;\n\t\tsamplingPos = basePos/ size;\n\t\ttexel = texture2D(inputImageTexture, samplingPos);\n\t\ty3 = dot(texel.rgb, ycoeff);\n\t\ty3 += offset.x;\n\t\n\t\tbasePos.x+=1.0;\n\t\tsamplingPos = basePos/ size;\n\t\ttexel = texture2D(inputImageTexture, samplingPos);\n\t\ty4 = dot(texel.rgb, ycoeff);\n\t\ty4 += offset.x;\n\t\n\t\tgl_FragColor = vec4(y1, y2, y3, y4);\n\t\t//gl_FragColor = vec4(y4, y3, y2, y1);\n\t}\n// u\n\telse if(nowTxtPos.y<uMaxPos.y){\n       nowTxtPos.y -= 0.25;\n       highp vec2 basePos = nowTxtPos * uvScale * size;\n       highp float addY = float(int(basePos.x / width));\n       basePos.x -= addY * width;\n       basePos.y += addY;\n       basePos.y *= 2.0;\n       basePos -= clamp(uvScale * 0.5 - 2.0, vec2(0.0), uvScale);\n       basePos.y -= 2.0;\n\t\n\t\thighp vec4 sample = texture2D(inputImageTexture, basePos/ size).rgba;\n\t\thighp float u1 = dot(sample.rgb, ucoeff);\n\t\tu1 += offset.y;\n\t\n\t\tbasePos.x+=2.0;\n\t\tsample = texture2D(inputImageTexture, basePos/ size).rgba;\n\t\tfloat u2 = dot(sample.rgb, ucoeff);\n\t\tu2 += offset.y;\n\t\n\t\tbasePos.x+=2.0;\n\t\tsample = texture2D(inputImageTexture, basePos / size).rgba;\n\t\tfloat u3 = dot(sample.rgb, ucoeff);\n\t\tu3 += offset.y;\n\t\n\t\tbasePos.x+=2.0;\n\t\tsample = texture2D(inputImageTexture, basePos / size).rgba;\n\t\tfloat u4 = dot(sample.rgb, ucoeff);\n\t\tu4 += offset.y;\n\t\n\t\tgl_FragColor = vec4(u1, u2, u3, u4);\n\t\t//gl_FragColor = vec4(0.5, 0.5, 0.5, 0.5);\n\t}\n// v\n\telse if(nowTxtPos.y<vMaxPos.y){\n       nowTxtPos -= uMaxPos;\n       highp vec2 basePos = nowTxtPos * uvScale * size;\n       highp float addY = float(int(basePos.x / width));\n       basePos.x -= addY * width;\n       basePos.y += addY;\n       basePos.y *= 2.0;\n       basePos -= clamp(uvScale * 0.5 - 2.0, vec2(0.0), uvScale);\n       basePos.y -= 2.0;\n\t\n\t\thighp vec4 sample = texture2D(inputImageTexture, basePos / size).rgba;\n\t\thighp float v1 = dot(sample.rgb, vcoeff);\n\t\tv1 += offset.z;\n\t\n\t\tbasePos.x+=2.0;\n\t\tsample = texture2D(inputImageTexture, basePos / size).rgba;\n\t\tfloat v2 = dot(sample.rgb, vcoeff);\n\t\tv2 += offset.z;\n\t\n\t\tbasePos.x+=2.0;\n\t\tsample = texture2D(inputImageTexture, basePos / size).rgba;\n\t\tfloat v3 = dot(sample.rgb, vcoeff);\n\t\tv3 += offset.z;\n\t\n\t\tbasePos.x+=2.0;\n\t\tsample = texture2D(inputImageTexture, basePos / size).rgba;\n\t\tfloat v4 = dot(sample.rgb, vcoeff);\n\t\tv4 += offset.z;\n\t\n\t\tgl_FragColor = vec4(v1, v2, v3, v4);\n       //gl_FragColor = vec4(0.5, 0.5, 0.5, 0.5);\n\t}\n\t//else gl_FragColor = vec4(0.0, 0.0, 0.0, 0.0);\n}\n";
  private int mBitrate = 0;
  ByteBuffer mByteBuffer = null;
  private int mHeightLocation = -1;
  public long mNativeX264Encoder = 0L;
  public long mPTS = 0L;
  private RGB2YUVFilter mRawFrameFilter;
  private int mWidthLocation = -1;
  
  static
  {
    TXCSystemUtil.loadLiteAVLibrary();
    nativeClassInit();
  }
  
  private static native void nativeClassInit();
  
  private native long nativeGetRealFPS(long paramLong);
  
  private native long nativeInit(WeakReference<TXCSWVideoEncoder> paramWeakReference);
  
  private native void nativeRelease(long paramLong);
  
  private native void nativeSetBitrate(long paramLong, int paramInt);
  
  private native int nativeStart(long paramLong, TXSVideoEncoderParam paramTXSVideoEncoderParam);
  
  private native void nativeStop(long paramLong);
  
  private native long nativegetRealBitrate(long paramLong);
  
  private static void postEventFromNative(WeakReference<TXCSWVideoEncoder> paramWeakReference, byte[] paramArrayOfByte, int paramInt1, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt2)
  {
    paramWeakReference = (TXCSWVideoEncoder)paramWeakReference.get();
    if (paramWeakReference != null) {
      paramWeakReference.callDelegate(paramArrayOfByte, paramInt1, paramLong1, paramLong2, paramLong3, paramLong4, paramLong5, paramLong6, paramInt2, null, null);
    }
  }
  
  public long getRealBitrate()
  {
    return nativegetRealBitrate(this.mNativeX264Encoder);
  }
  
  public long getRealFPS()
  {
    return nativeGetRealFPS(this.mNativeX264Encoder);
  }
  
  public native int nativeEncode(long paramLong1, int paramInt1, int paramInt2, int paramInt3, long paramLong2);
  
  public long pushVideoFrame(final int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    if (this.mGLContextExternal != null)
    {
      final int[] arrayOfInt = new int[1];
      this.mPTS = paramLong;
      if (this.mRawFrameFilter == null)
      {
        this.mRawFrameFilter = new RGB2YUVFilter();
        if (!this.mRawFrameFilter.init()) {
          this.mRawFrameFilter = null;
        }
      }
      while (this.mRawFrameFilter == null)
      {
        return 10000004L;
        this.mRawFrameFilter.onOutputSizeChanged(paramInt2, paramInt3);
        this.mRawFrameFilter.setListener(new TXCGPUFilter.OnFilterListener()
        {
          public void onFilterListener(int paramAnonymousInt)
          {
            arrayOfInt[0] = TXCSWVideoEncoder.this.nativeEncode(TXCSWVideoEncoder.this.mNativeX264Encoder, paramInt1, TXCSWVideoEncoder.this.mOutputWidth, TXCSWVideoEncoder.this.mOutputHeight, TXCSWVideoEncoder.this.mPTS);
          }
        });
      }
      GLES20.glViewport(0, 0, this.mOutputWidth, this.mOutputHeight);
      GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      this.mRawFrameFilter.onDrawToTexture(paramInt1);
      paramInt1 = arrayOfInt[0];
      if (paramInt1 != 0) {
        callDelegate(paramInt1);
      }
    }
    return 0L;
  }
  
  public void setBitrate(int paramInt)
  {
    this.mBitrate = paramInt;
    nativeSetBitrate(this.mNativeX264Encoder, paramInt);
  }
  
  public void setFPS(int paramInt) {}
  
  public int start(TXSVideoEncoderParam paramTXSVideoEncoderParam)
  {
    super.start(paramTXSVideoEncoderParam);
    this.mNativeX264Encoder = nativeInit(new WeakReference(this));
    nativeSetBitrate(this.mNativeX264Encoder, this.mBitrate);
    nativeStart(this.mNativeX264Encoder, paramTXSVideoEncoderParam);
    return 0;
  }
  
  public void stop()
  {
    this.mGLContextExternal = null;
    nativeStop(this.mNativeX264Encoder);
    nativeRelease(this.mNativeX264Encoder);
    this.mNativeX264Encoder = 0L;
    if (this.mRawFrameFilter != null)
    {
      this.mRawFrameFilter.destroy();
      this.mRawFrameFilter = null;
    }
    super.stop();
  }
  
  private static class RGB2YUVFilter
    extends TXCGPUFilter
  {
    private int mHeightLocation = -1;
    private int mWidthLocation = -1;
    
    public RGB2YUVFilter()
    {
      super("\nprecision highp float;\nvarying highp vec2 textureCoordinate;\nuniform highp sampler2D inputImageTexture;\t\t\t// 原始纹理\nuniform float width;\t\t\t// 纹理宽\nuniform float height;\t\t\t// 纹理高\n\nvoid main(void) {\n\tvec3 offset = vec3(0.0625, 0.5, 0.5);\n\tvec3 ycoeff = vec3(0.256816, 0.504154, 0.0979137);\n\tvec3 ucoeff = vec3(-0.148246, -0.29102, 0.439266);\n\tvec3 vcoeff = vec3(0.439271, -0.367833, -0.071438);\n\n\tvec2 nowTxtPos = textureCoordinate;\n\tvec2 size = vec2(width, height);\n\n\tfloat uvlines = height / 16.0;   // 0.625:w*h/4(uv数据所占内存空间) / w*h*4(rgba总空间) = 0.625(u或v数据在当前fbo中所占比例);uvlines:uv数据需要多少行\n\tfloat uvlinesI = float(int(uvlines));\n\tvec2 uvPosOffset = vec2(0.0,0.0625);\n\tvec2 uMaxPos = uvPosOffset+vec2(0,0.25);\n\tvec2 vMaxPos = uvPosOffset+uMaxPos;\n\n\tvec2 yScale = vec2(4.0,4.0);\n\tvec2 uvScale = vec2(8.0,8.0);\n// y\n\n\tif(nowTxtPos.y<0.25){\n// y base postion\n       vec2 basePos = nowTxtPos * yScale * size;\n       float addY = float(int((basePos.x / width)));\n       basePos.x -= addY * width;\n       basePos.y += addY;\n// y1 y2 y3 y4\n\t\tfloat y1,y2,y3,y4;\n\t\n\tbasePos.x -= 0.2;\n\tbasePos.y -= 0.2;\n\t\tvec2 samplingPos = basePos / size;\n\t\tvec4 texel = texture2D(inputImageTexture, samplingPos);\n\t\ty1 = dot(texel.rgb, ycoeff);\n\t\ty1 += offset.x;\n\t\n\t\tbasePos.x+=1.0;\n\t\tsamplingPos = basePos/ size;\n\t\ttexel = texture2D(inputImageTexture, samplingPos);\n\t\ty2 = dot(texel.rgb, ycoeff);\n\t\ty2 += offset.x;\n\n\t\n\t\tbasePos.x+=1.0;\n\t\tsamplingPos = basePos/ size;\n\t\ttexel = texture2D(inputImageTexture, samplingPos);\n\t\ty3 = dot(texel.rgb, ycoeff);\n\t\ty3 += offset.x;\n\t\n\t\tbasePos.x+=1.0;\n\t\tsamplingPos = basePos/ size;\n\t\ttexel = texture2D(inputImageTexture, samplingPos);\n\t\ty4 = dot(texel.rgb, ycoeff);\n\t\ty4 += offset.x;\n\t\n\t\tgl_FragColor = vec4(y1, y2, y3, y4);\n\t\t//gl_FragColor = vec4(y4, y3, y2, y1);\n\t}\n// u\n\telse if(nowTxtPos.y<uMaxPos.y){\n       nowTxtPos.y -= 0.25;\n       highp vec2 basePos = nowTxtPos * uvScale * size;\n       highp float addY = float(int(basePos.x / width));\n       basePos.x -= addY * width;\n       basePos.y += addY;\n       basePos.y *= 2.0;\n       basePos -= clamp(uvScale * 0.5 - 2.0, vec2(0.0), uvScale);\n       basePos.y -= 2.0;\n\t\n\t\thighp vec4 sample = texture2D(inputImageTexture, basePos/ size).rgba;\n\t\thighp float u1 = dot(sample.rgb, ucoeff);\n\t\tu1 += offset.y;\n\t\n\t\tbasePos.x+=2.0;\n\t\tsample = texture2D(inputImageTexture, basePos/ size).rgba;\n\t\tfloat u2 = dot(sample.rgb, ucoeff);\n\t\tu2 += offset.y;\n\t\n\t\tbasePos.x+=2.0;\n\t\tsample = texture2D(inputImageTexture, basePos / size).rgba;\n\t\tfloat u3 = dot(sample.rgb, ucoeff);\n\t\tu3 += offset.y;\n\t\n\t\tbasePos.x+=2.0;\n\t\tsample = texture2D(inputImageTexture, basePos / size).rgba;\n\t\tfloat u4 = dot(sample.rgb, ucoeff);\n\t\tu4 += offset.y;\n\t\n\t\tgl_FragColor = vec4(u1, u2, u3, u4);\n\t\t//gl_FragColor = vec4(0.5, 0.5, 0.5, 0.5);\n\t}\n// v\n\telse if(nowTxtPos.y<vMaxPos.y){\n       nowTxtPos -= uMaxPos;\n       highp vec2 basePos = nowTxtPos * uvScale * size;\n       highp float addY = float(int(basePos.x / width));\n       basePos.x -= addY * width;\n       basePos.y += addY;\n       basePos.y *= 2.0;\n       basePos -= clamp(uvScale * 0.5 - 2.0, vec2(0.0), uvScale);\n       basePos.y -= 2.0;\n\t\n\t\thighp vec4 sample = texture2D(inputImageTexture, basePos / size).rgba;\n\t\thighp float v1 = dot(sample.rgb, vcoeff);\n\t\tv1 += offset.z;\n\t\n\t\tbasePos.x+=2.0;\n\t\tsample = texture2D(inputImageTexture, basePos / size).rgba;\n\t\tfloat v2 = dot(sample.rgb, vcoeff);\n\t\tv2 += offset.z;\n\t\n\t\tbasePos.x+=2.0;\n\t\tsample = texture2D(inputImageTexture, basePos / size).rgba;\n\t\tfloat v3 = dot(sample.rgb, vcoeff);\n\t\tv3 += offset.z;\n\t\n\t\tbasePos.x+=2.0;\n\t\tsample = texture2D(inputImageTexture, basePos / size).rgba;\n\t\tfloat v4 = dot(sample.rgb, vcoeff);\n\t\tv4 += offset.z;\n\t\n\t\tgl_FragColor = vec4(v1, v2, v3, v4);\n       //gl_FragColor = vec4(0.5, 0.5, 0.5, 0.5);\n\t}\n\t//else gl_FragColor = vec4(0.0, 0.0, 0.0, 0.0);\n}\n");
      setHasFrameBuffer(true);
    }
    
    public boolean onInit()
    {
      boolean bool = super.onInit();
      if (bool)
      {
        this.mWidthLocation = GLES20.glGetUniformLocation(this.mGLProgId, "width");
        this.mHeightLocation = GLES20.glGetUniformLocation(this.mGLProgId, "height");
      }
      return bool;
    }
    
    public void onOutputSizeChanged(int paramInt1, int paramInt2)
    {
      super.onOutputSizeChanged(paramInt1, paramInt2);
      GLES20.glUseProgram(this.mGLProgId);
      GLES20.glUniform1f(this.mWidthLocation, paramInt1);
      GLES20.glUniform1f(this.mHeightLocation, paramInt2);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\videoencoder\TXCSWVideoEncoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */