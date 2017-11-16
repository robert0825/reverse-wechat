package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aix
  extends azh
{
  public aiy uyc;
  public LinkedList<aiv> uyd;
  public String uye;
  public LinkedList<ajw> uyf;
  
  public aix()
  {
    GMTrace.i(3863725735936L, 28787);
    this.uyd = new LinkedList();
    this.uyf = new LinkedList();
    GMTrace.o(3863725735936L, 28787);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3863859953664L, 28788);
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
      if (this.uyc != null)
      {
        paramVarArgs.fm(2, this.uyc.aYq());
        this.uyc.a(paramVarArgs);
      }
      paramVarArgs.d(3, 8, this.uyd);
      if (this.uye != null) {
        paramVarArgs.e(4, this.uye);
      }
      paramVarArgs.d(5, 8, this.uyf);
      GMTrace.o(3863859953664L, 28788);
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
      if (this.uyc != null) {
        i = paramInt + b.a.a.a.fj(2, this.uyc.aYq());
      }
      i += b.a.a.a.c(3, 8, this.uyd);
      paramInt = i;
      if (this.uye != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uye);
      }
      i = b.a.a.a.c(5, 8, this.uyf);
      GMTrace.o(3863859953664L, 28788);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uyd.clear();
      this.uyf.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3863859953664L, 28788);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aix localaix = (aix)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3863859953664L, 28788);
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
          localaix.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3863859953664L, 28788);
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
          localaix.uyc = ((aiy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3863859953664L, 28788);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aiv();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aiv)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaix.uyd.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3863859953664L, 28788);
        return 0;
      case 4: 
        localaix.uye = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3863859953664L, 28788);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ajw();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((ajw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localaix.uyf.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3863859953664L, 28788);
      return 0;
    }
    GMTrace.o(3863859953664L, 28788);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */