package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ajt
  extends azh
{
  public com.tencent.mm.bm.b jgP;
  public String lRT;
  public String tOY;
  public baa uyC;
  public aiy uyv;
  
  public ajt()
  {
    GMTrace.i(3619852124160L, 26970);
    GMTrace.o(3619852124160L, 26970);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3619986341888L, 26971);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.uyv != null)
      {
        paramVarArgs.fm(2, this.uyv.aYq());
        this.uyv.a(paramVarArgs);
      }
      if (this.jgP != null) {
        paramVarArgs.b(3, this.jgP);
      }
      if (this.uyC != null)
      {
        paramVarArgs.fm(4, this.uyC.aYq());
        this.uyC.a(paramVarArgs);
      }
      if (this.lRT != null) {
        paramVarArgs.e(5, this.lRT);
      }
      if (this.tOY != null) {
        paramVarArgs.e(6, this.tOY);
      }
      GMTrace.o(3619986341888L, 26971);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.uyv != null) {
        paramInt = i + b.a.a.a.fj(2, this.uyv.aYq());
      }
      i = paramInt;
      if (this.jgP != null) {
        i = paramInt + b.a.a.a.a(3, this.jgP);
      }
      paramInt = i;
      if (this.uyC != null) {
        paramInt = i + b.a.a.a.fj(4, this.uyC.aYq());
      }
      i = paramInt;
      if (this.lRT != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.lRT);
      }
      paramInt = i;
      if (this.tOY != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tOY);
      }
      GMTrace.o(3619986341888L, 26971);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3619986341888L, 26971);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ajt localajt = (ajt)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3619986341888L, 26971);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localajt.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619986341888L, 26971);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aiy();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aiy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localajt.uyv = ((aiy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619986341888L, 26971);
        return 0;
      case 3: 
        localajt.jgP = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(3619986341888L, 26971);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new baa();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((baa)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localajt.uyC = ((baa)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619986341888L, 26971);
        return 0;
      case 5: 
        localajt.lRT = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3619986341888L, 26971);
        return 0;
      }
      localajt.tOY = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3619986341888L, 26971);
      return 0;
    }
    GMTrace.o(3619986341888L, 26971);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ajt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */