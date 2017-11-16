package com.tencent.mm.plugin.normsg.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public enum d
  implements b
{
  private static b nxK;
  
  static
  {
    GMTrace.i(17560779096064L, 130838);
    nxJ = new d("INSTANCE");
    nxL = new d[] { nxJ };
    nxK = new a();
    GMTrace.o(17560779096064L, 130838);
  }
  
  private d()
  {
    GMTrace.i(17559839571968L, 130831);
    GMTrace.o(17559839571968L, 130831);
  }
  
  public static void a(b paramb)
  {
    GMTrace.i(17559973789696L, 130832);
    if (paramb != null) {
      nxK = paramb;
    }
    GMTrace.o(17559973789696L, 130832);
  }
  
  public final String DX(String paramString)
  {
    GMTrace.i(18980131569664L, 141413);
    paramString = nxK.DX(paramString);
    GMTrace.o(18980131569664L, 141413);
    return paramString;
  }
  
  public final void K(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(21019033075712L, 156604);
    nxK.K(paramInt1, paramInt2, paramInt3);
    GMTrace.o(21019033075712L, 156604);
  }
  
  public final String a(Object[][] paramArrayOfObject)
  {
    GMTrace.i(21019167293440L, 156605);
    paramArrayOfObject = nxK.a(paramArrayOfObject);
    GMTrace.o(21019167293440L, 156605);
    return paramArrayOfObject;
  }
  
  public final boolean a(Object paramObject, Class paramClass)
  {
    GMTrace.i(17814853255168L, 132731);
    boolean bool = nxK.a(paramObject, paramClass);
    GMTrace.o(17814853255168L, 132731);
    return bool;
  }
  
  public final String aUo()
  {
    GMTrace.i(17560510660608L, 130836);
    String str = nxK.aUo();
    GMTrace.o(17560510660608L, 130836);
    return str;
  }
  
  public final boolean aUp()
  {
    GMTrace.i(17560644878336L, 130837);
    boolean bool = nxK.aUp();
    GMTrace.o(17560644878336L, 130837);
    return bool;
  }
  
  public final byte[] aUq()
  {
    GMTrace.i(18980400005120L, 141415);
    byte[] arrayOfByte = nxK.aUq();
    GMTrace.o(18980400005120L, 141415);
    return arrayOfByte;
  }
  
  public final boolean bh(Object paramObject)
  {
    GMTrace.i(20314255785984L, 151353);
    boolean bool = nxK.bh(paramObject);
    GMTrace.o(20314255785984L, 151353);
    return bool;
  }
  
  public final String gv(boolean paramBoolean)
  {
    GMTrace.i(18980265787392L, 141414);
    String str = nxK.gv(paramBoolean);
    GMTrace.o(18980265787392L, 141414);
    return str;
  }
  
  public final String n(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(20314121568256L, 151352);
    String str = nxK.n(paramBoolean1, paramBoolean2);
    GMTrace.o(20314121568256L, 151352);
    return str;
  }
  
  public final String rR(int paramInt)
  {
    GMTrace.i(17560242225152L, 130834);
    String str = nxK.rR(paramInt);
    GMTrace.o(17560242225152L, 130834);
    return str;
  }
  
  private static final class a
    implements b
  {
    public a()
    {
      GMTrace.i(17556484128768L, 130806);
      GMTrace.o(17556484128768L, 130806);
    }
    
    public final String DX(String paramString)
    {
      GMTrace.i(18981607964672L, 141424);
      w.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      GMTrace.o(18981607964672L, 141424);
      return paramString;
    }
    
    public final void K(int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(21019569946624L, 156608);
      w.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      GMTrace.o(21019569946624L, 156608);
    }
    
    public final String a(Object[][] paramArrayOfObject)
    {
      GMTrace.i(21019704164352L, 156609);
      w.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      GMTrace.o(21019704164352L, 156609);
      return "";
    }
    
    public final boolean a(Object paramObject, Class paramClass)
    {
      GMTrace.i(17814987472896L, 132732);
      w.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      GMTrace.o(17814987472896L, 132732);
      return false;
    }
    
    public final String aUo()
    {
      GMTrace.i(18981876400128L, 141426);
      w.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      GMTrace.o(18981876400128L, 141426);
      return "";
    }
    
    public final boolean aUp()
    {
      GMTrace.i(17557020999680L, 130810);
      w.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      GMTrace.o(17557020999680L, 130810);
      return false;
    }
    
    public final byte[] aUq()
    {
      GMTrace.i(18982010617856L, 141427);
      w.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      GMTrace.o(18982010617856L, 141427);
      return new byte[0];
    }
    
    public final boolean bh(Object paramObject)
    {
      GMTrace.i(20314792656896L, 151357);
      w.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      GMTrace.o(20314792656896L, 151357);
      return false;
    }
    
    public final String gv(boolean paramBoolean)
    {
      GMTrace.i(18981742182400L, 141425);
      w.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      GMTrace.o(18981742182400L, 141425);
      return "";
    }
    
    public final String n(boolean paramBoolean1, boolean paramBoolean2)
    {
      GMTrace.i(20314658439168L, 151356);
      w.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      GMTrace.o(20314658439168L, 151356);
      return "";
    }
    
    public final String rR(int paramInt)
    {
      GMTrace.i(17556752564224L, 130808);
      w.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      GMTrace.o(17556752564224L, 130808);
      return "";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\normsg\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */