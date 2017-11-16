package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bki
  extends azh
{
  public int uVb;
  public du uVc;
  public ap uVd;
  public apz uVe;
  
  public bki()
  {
    GMTrace.i(13577196929024L, 101158);
    GMTrace.o(13577196929024L, 101158);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13577331146752L, 101159);
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
      paramVarArgs.fk(2, this.uVb);
      if (this.uVc != null)
      {
        paramVarArgs.fm(3, this.uVc.aYq());
        this.uVc.a(paramVarArgs);
      }
      if (this.uVd != null)
      {
        paramVarArgs.fm(4, this.uVd.aYq());
        this.uVd.a(paramVarArgs);
      }
      if (this.uVe != null)
      {
        paramVarArgs.fm(5, this.uVe.aYq());
        this.uVe.a(paramVarArgs);
      }
      GMTrace.o(13577331146752L, 101159);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uVb);
      paramInt = i;
      if (this.uVc != null) {
        paramInt = i + b.a.a.a.fj(3, this.uVc.aYq());
      }
      i = paramInt;
      if (this.uVd != null) {
        i = paramInt + b.a.a.a.fj(4, this.uVd.aYq());
      }
      paramInt = i;
      if (this.uVe != null) {
        paramInt = i + b.a.a.a.fj(5, this.uVe.aYq());
      }
      GMTrace.o(13577331146752L, 101159);
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
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(13577331146752L, 101159);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bki localbki = (bki)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13577331146752L, 101159);
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
          localbki.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13577331146752L, 101159);
        return 0;
      case 2: 
        localbki.uVb = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13577331146752L, 101159);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new du();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((du)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbki.uVc = ((du)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13577331146752L, 101159);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ap();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ap)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbki.uVd = ((ap)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13577331146752L, 101159);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new apz();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((apz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localbki.uVe = ((apz)localObject1);
        paramInt += 1;
      }
      GMTrace.o(13577331146752L, 101159);
      return 0;
    }
    GMTrace.o(13577331146752L, 101159);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bki.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */