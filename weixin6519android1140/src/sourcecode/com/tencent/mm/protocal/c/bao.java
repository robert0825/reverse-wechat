package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bao
  extends azh
{
  public String uOm;
  public azp uqp;
  public long uqs;
  
  public bao()
  {
    GMTrace.i(3835003142144L, 28573);
    GMTrace.o(3835003142144L, 28573);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3835137359872L, 28574);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uOm == null) {
        throw new b("Not all required fields were included: SearchResult");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.uOm != null) {
        paramVarArgs.e(2, this.uOm);
      }
      if (this.uqp != null)
      {
        paramVarArgs.fm(3, this.uqp.aYq());
        this.uqp.a(paramVarArgs);
      }
      paramVarArgs.T(4, this.uqs);
      GMTrace.o(3835137359872L, 28574);
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
      if (this.uOm != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uOm);
      }
      i = paramInt;
      if (this.uqp != null) {
        i = paramInt + b.a.a.a.fj(3, this.uqp.aYq());
      }
      paramInt = b.a.a.a.S(4, this.uqs);
      GMTrace.o(3835137359872L, 28574);
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
      if (this.uOm == null) {
        throw new b("Not all required fields were included: SearchResult");
      }
      GMTrace.o(3835137359872L, 28574);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bao localbao = (bao)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3835137359872L, 28574);
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
          localbao.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3835137359872L, 28574);
        return 0;
      case 2: 
        localbao.uOm = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3835137359872L, 28574);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbao.uqp = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3835137359872L, 28574);
        return 0;
      }
      localbao.uqs = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(3835137359872L, 28574);
      return 0;
    }
    GMTrace.o(3835137359872L, 28574);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */