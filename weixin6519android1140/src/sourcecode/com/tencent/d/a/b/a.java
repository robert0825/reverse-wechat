package com.tencent.d.a.b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.security.keystore.KeyGenParameterSpec.Builder;
import com.tencent.d.a.c.c;
import java.lang.reflect.Constructor;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Date;
import javax.security.auth.x500.X500Principal;

public abstract class a
{
  public static String[] M(String[] paramArrayOfString)
  {
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0)) {
      return (String[])paramArrayOfString.clone();
    }
    return paramArrayOfString;
  }
  
  public static a Yx(String paramString)
  {
    if (com.tencent.d.a.a.cpw())
    {
      if (Build.VERSION.SDK_INT >= 23) {
        return new b(paramString, 4);
      }
      return new c(paramString, 4);
    }
    c.e("Soter.KeyGenParameterSpecCompatBuilder", "soter: not support soter. return dummy", new Object[0]);
    return new a();
  }
  
  public abstract a K(String... paramVarArgs);
  
  public abstract a L(String... paramVarArgs);
  
  public abstract AlgorithmParameterSpec cpD();
  
  public abstract a cpE();
  
  static final class a
    extends a
  {
    public final a K(String... paramVarArgs)
    {
      return null;
    }
    
    public final a L(String... paramVarArgs)
    {
      return null;
    }
    
    public final AlgorithmParameterSpec cpD()
    {
      return null;
    }
    
    public final a cpE()
    {
      return null;
    }
  }
  
  @TargetApi(23)
  private static final class b
    extends a
  {
    private KeyGenParameterSpec.Builder xZI = null;
    
    public b(String paramString, int paramInt)
    {
      this.xZI = new KeyGenParameterSpec.Builder(paramString, 4);
    }
    
    @SuppressLint({"WrongConstant"})
    public final a K(String... paramVarArgs)
    {
      this.xZI.setDigests(paramVarArgs);
      return this;
    }
    
    @SuppressLint({"WrongConstant"})
    public final a L(String... paramVarArgs)
    {
      this.xZI.setSignaturePaddings(paramVarArgs);
      return this;
    }
    
    public final AlgorithmParameterSpec cpD()
    {
      return this.xZI.build();
    }
    
    public final a cpE()
    {
      this.xZI.setUserAuthenticationRequired(true);
      return this;
    }
  }
  
  static final class c
    extends a
  {
    private final String xZJ;
    private int xZK;
    private int xZL = -1;
    private AlgorithmParameterSpec xZM;
    private X500Principal xZN;
    private BigInteger xZO;
    private Date xZP;
    private Date xZQ;
    private Date xZR;
    private Date xZS;
    private Date xZT;
    private String[] xZU;
    private String[] xZV;
    private String[] xZW;
    private String[] xZX;
    private boolean xZY = true;
    private boolean xZZ;
    private int yaa = -1;
    
    public c(String paramString, int paramInt)
    {
      if (paramString == null) {
        throw new NullPointerException("keystoreAlias == null");
      }
      if (paramString.isEmpty()) {
        throw new IllegalArgumentException("keystoreAlias must not be empty");
      }
      this.xZJ = paramString;
      this.xZK = 4;
    }
    
    public final a K(String... paramVarArgs)
    {
      this.xZU = M(paramVarArgs);
      return this;
    }
    
    public final a L(String... paramVarArgs)
    {
      this.xZW = M(paramVarArgs);
      return this;
    }
    
    public final AlgorithmParameterSpec cpD()
    {
      return (AlgorithmParameterSpec)Class.forName("android.security.keystore.KeyGenParameterSpec").getConstructor(new Class[] { String.class, Integer.TYPE, AlgorithmParameterSpec.class, X500Principal.class, BigInteger.class, Date.class, Date.class, Date.class, Date.class, Date.class, Integer.TYPE, String[].class, String[].class, String[].class, String[].class, Boolean.TYPE, Boolean.TYPE, Integer.TYPE }).newInstance(new Object[] { this.xZJ, Integer.valueOf(this.xZL), this.xZM, this.xZN, this.xZO, this.xZP, this.xZQ, this.xZR, this.xZS, this.xZT, Integer.valueOf(this.xZK), this.xZU, this.xZV, this.xZW, this.xZX, Boolean.valueOf(this.xZY), Boolean.valueOf(this.xZZ), Integer.valueOf(this.yaa) });
    }
    
    public final a cpE()
    {
      this.xZZ = true;
      return this;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\d\a\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */