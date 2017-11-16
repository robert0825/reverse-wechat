package com.tencent.d.b.f;

import android.content.Context;
import com.tencent.d.b.c.a;
import com.tencent.d.b.e.c;
import com.tencent.d.b.e.f;

public final class b
{
  public int gRb;
  public a llw;
  public Context mContext;
  public String rzb;
  public c yaN;
  public f yaO;
  public com.tencent.d.b.c.b yaP;
  
  public final String toString()
  {
    return "AuthenticationParam{mScene=" + this.gRb + ", mChallenge='" + this.rzb + '\'' + ", mIWrapGetChallengeStr=" + this.yaN + ", mIWrapUploadSignature=" + this.yaO + ", mContext=" + this.mContext + ", mFingerprintCanceller=" + this.llw + ", mSoterFingerprintStateCallback=" + this.yaP + '}';
  }
  
  public static final class a
  {
    public b yaQ = new b();
    
    public final a Fm(int paramInt)
    {
      this.yaQ.gRb = paramInt;
      return this;
    }
    
    public final a Yz(String paramString)
    {
      this.yaQ.rzb = paramString;
      return this;
    }
    
    public final a a(a parama)
    {
      this.yaQ.llw = parama;
      return this;
    }
    
    public final a a(com.tencent.d.b.c.b paramb)
    {
      this.yaQ.yaP = paramb;
      return this;
    }
    
    public final a hP(Context paramContext)
    {
      this.yaQ.mContext = paramContext;
      return this;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\d\b\f\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */