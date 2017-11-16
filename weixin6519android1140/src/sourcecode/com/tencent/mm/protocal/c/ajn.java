package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ajn
  extends azh
{
  public String lRT;
  public String tOY;
  public LinkedList<baa> uod;
  public aiy uyv;
  
  public ajn()
  {
    GMTrace.i(3830037086208L, 28536);
    this.uod = new LinkedList();
    GMTrace.o(3830037086208L, 28536);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3830171303936L, 28537);
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
      if (this.uyv != null)
      {
        paramVarArgs.fm(2, this.uyv.aYq());
        this.uyv.a(paramVarArgs);
      }
      paramVarArgs.d(3, 8, this.uod);
      if (this.lRT != null) {
        paramVarArgs.e(4, this.lRT);
      }
      if (this.tOY != null) {
        paramVarArgs.e(5, this.tOY);
      }
      GMTrace.o(3830171303936L, 28537);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt;
      if (this.uyv != null) {
        i = paramInt + b.a.a.a.fj(2, this.uyv.aYq());
      }
      i += b.a.a.a.c(3, 8, this.uod);
      paramInt = i;
      if (this.lRT != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lRT);
      }
      i = paramInt;
      if (this.tOY != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tOY);
      }
      GMTrace.o(3830171303936L, 28537);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uod.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3830171303936L, 28537);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ajn localajn = (ajn)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3830171303936L, 28537);
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
          localajn.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3830171303936L, 28537);
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
          localajn.uyv = ((aiy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3830171303936L, 28537);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new baa();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((baa)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localajn.uod.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3830171303936L, 28537);
        return 0;
      case 4: 
        localajn.lRT = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3830171303936L, 28537);
        return 0;
      }
      localajn.tOY = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3830171303936L, 28537);
      return 0;
    }
    GMTrace.o(3830171303936L, 28537);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ajn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */