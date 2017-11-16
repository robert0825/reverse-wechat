package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import java.util.LinkedList;

public final class aiw
  extends ayx
{
  public String eDJ;
  public String lPg;
  public String scope;
  public String signature;
  public String url;
  public String uxW;
  public String uxY;
  public String uxZ;
  public b uya;
  public int uyb;
  
  public aiw()
  {
    GMTrace.i(3624683962368L, 27006);
    GMTrace.o(3624683962368L, 27006);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3624818180096L, 27007);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.url != null) {
        paramVarArgs.e(2, this.url);
      }
      if (this.lPg != null) {
        paramVarArgs.e(3, this.lPg);
      }
      if (this.uxW != null) {
        paramVarArgs.e(4, this.uxW);
      }
      if (this.eDJ != null) {
        paramVarArgs.e(5, this.eDJ);
      }
      if (this.uxY != null) {
        paramVarArgs.e(6, this.uxY);
      }
      if (this.signature != null) {
        paramVarArgs.e(7, this.signature);
      }
      if (this.uxZ != null) {
        paramVarArgs.e(8, this.uxZ);
      }
      if (this.uya != null) {
        paramVarArgs.b(9, this.uya);
      }
      paramVarArgs.fk(10, this.uyb);
      if (this.scope != null) {
        paramVarArgs.e(11, this.scope);
      }
      GMTrace.o(3624818180096L, 27007);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.url != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.url);
      }
      i = paramInt;
      if (this.lPg != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lPg);
      }
      paramInt = i;
      if (this.uxW != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uxW);
      }
      i = paramInt;
      if (this.eDJ != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.eDJ);
      }
      paramInt = i;
      if (this.uxY != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uxY);
      }
      i = paramInt;
      if (this.signature != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.signature);
      }
      paramInt = i;
      if (this.uxZ != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.uxZ);
      }
      i = paramInt;
      if (this.uya != null) {
        i = paramInt + b.a.a.a.a(9, this.uya);
      }
      i += b.a.a.a.fh(10, this.uyb);
      paramInt = i;
      if (this.scope != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.scope);
      }
      GMTrace.o(3624818180096L, 27007);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3624818180096L, 27007);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aiw localaiw = (aiw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3624818180096L, 27007);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localaiw.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3624818180096L, 27007);
        return 0;
      case 2: 
        localaiw.url = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3624818180096L, 27007);
        return 0;
      case 3: 
        localaiw.lPg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3624818180096L, 27007);
        return 0;
      case 4: 
        localaiw.uxW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3624818180096L, 27007);
        return 0;
      case 5: 
        localaiw.eDJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3624818180096L, 27007);
        return 0;
      case 6: 
        localaiw.uxY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3624818180096L, 27007);
        return 0;
      case 7: 
        localaiw.signature = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3624818180096L, 27007);
        return 0;
      case 8: 
        localaiw.uxZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3624818180096L, 27007);
        return 0;
      case 9: 
        localaiw.uya = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(3624818180096L, 27007);
        return 0;
      case 10: 
        localaiw.uyb = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3624818180096L, 27007);
        return 0;
      }
      localaiw.scope = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3624818180096L, 27007);
      return 0;
    }
    GMTrace.o(3624818180096L, 27007);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aiw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */