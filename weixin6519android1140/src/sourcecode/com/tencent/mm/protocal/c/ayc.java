package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ayc
  extends azh
{
  public String uMA;
  public int uMB;
  public apz upa;
  
  public ayc()
  {
    GMTrace.i(14518331637760L, 108170);
    GMTrace.o(14518331637760L, 108170);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14518465855488L, 108171);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.uMA != null) {
        paramVarArgs.e(2, this.uMA);
      }
      if (this.upa != null)
      {
        paramVarArgs.fm(3, this.upa.aYq());
        this.upa.a(paramVarArgs);
      }
      paramVarArgs.fk(4, this.uMB);
      GMTrace.o(14518465855488L, 108171);
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
      if (this.uMA != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uMA);
      }
      i = paramInt;
      if (this.upa != null) {
        i = paramInt + b.a.a.a.fj(3, this.upa.aYq());
      }
      paramInt = b.a.a.a.fh(4, this.uMB);
      GMTrace.o(14518465855488L, 108171);
      return i + paramInt;
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
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(14518465855488L, 108171);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ayc localayc = (ayc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(14518465855488L, 108171);
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
          localayc.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(14518465855488L, 108171);
        return 0;
      case 2: 
        localayc.uMA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14518465855488L, 108171);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new apz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((apz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localayc.upa = ((apz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(14518465855488L, 108171);
        return 0;
      }
      localayc.uMB = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(14518465855488L, 108171);
      return 0;
    }
    GMTrace.o(14518465855488L, 108171);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ayc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */