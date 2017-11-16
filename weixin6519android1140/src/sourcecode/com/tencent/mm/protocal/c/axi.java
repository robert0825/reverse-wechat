package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class axi
  extends azh
{
  public String kJb;
  public axf uLW;
  public int uMk;
  public int uMl;
  public String uMm;
  
  public axi()
  {
    GMTrace.i(4005459656704L, 29843);
    GMTrace.o(4005459656704L, 29843);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4005593874432L, 29844);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uLW == null) {
        throw new b("Not all required fields were included: rcptinfolist");
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uLW != null)
      {
        paramVarArgs.fm(1, this.uLW.aYq());
        this.uLW.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uMk);
      if (this.uND != null)
      {
        paramVarArgs.fm(3, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.kJb != null) {
        paramVarArgs.e(4, this.kJb);
      }
      paramVarArgs.fk(5, this.uMl);
      if (this.uMm != null) {
        paramVarArgs.e(6, this.uMm);
      }
      GMTrace.o(4005593874432L, 29844);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uLW != null) {
        paramInt = b.a.a.a.fj(1, this.uLW.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uMk);
      paramInt = i;
      if (this.uND != null) {
        paramInt = i + b.a.a.a.fj(3, this.uND.aYq());
      }
      i = paramInt;
      if (this.kJb != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.kJb);
      }
      i += b.a.a.a.fh(5, this.uMl);
      paramInt = i;
      if (this.uMm != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uMm);
      }
      GMTrace.o(4005593874432L, 29844);
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
      if (this.uLW == null) {
        throw new b("Not all required fields were included: rcptinfolist");
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(4005593874432L, 29844);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      axi localaxi = (axi)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4005593874432L, 29844);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axf();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaxi.uLW = ((axf)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4005593874432L, 29844);
        return 0;
      case 2: 
        localaxi.uMk = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4005593874432L, 29844);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaxi.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4005593874432L, 29844);
        return 0;
      case 4: 
        localaxi.kJb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4005593874432L, 29844);
        return 0;
      case 5: 
        localaxi.uMl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4005593874432L, 29844);
        return 0;
      }
      localaxi.uMm = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(4005593874432L, 29844);
      return 0;
    }
    GMTrace.o(4005593874432L, 29844);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\axi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */