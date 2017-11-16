package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aha
  extends azh
{
  public azp tSa;
  public int uwA;
  public azp uww;
  public azp uwx;
  public int uwy;
  public int uwz;
  
  public aha()
  {
    GMTrace.i(3709106913280L, 27635);
    GMTrace.o(3709106913280L, 27635);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3709241131008L, 27636);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.tSa == null) {
        throw new b("Not all required fields were included: SessionKey");
      }
      if (this.uww == null) {
        throw new b("Not all required fields were included: SessionBuffer");
      }
      if (this.uwx == null) {
        throw new b("Not all required fields were included: KeyBuffer");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.tSa != null)
      {
        paramVarArgs.fm(2, this.tSa.aYq());
        this.tSa.a(paramVarArgs);
      }
      if (this.uww != null)
      {
        paramVarArgs.fm(3, this.uww.aYq());
        this.uww.a(paramVarArgs);
      }
      if (this.uwx != null)
      {
        paramVarArgs.fm(4, this.uwx.aYq());
        this.uwx.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.uwy);
      paramVarArgs.fk(6, this.uwz);
      paramVarArgs.fk(7, this.uwA);
      GMTrace.o(3709241131008L, 27636);
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
      if (this.tSa != null) {
        paramInt = i + b.a.a.a.fj(2, this.tSa.aYq());
      }
      i = paramInt;
      if (this.uww != null) {
        i = paramInt + b.a.a.a.fj(3, this.uww.aYq());
      }
      paramInt = i;
      if (this.uwx != null) {
        paramInt = i + b.a.a.a.fj(4, this.uwx.aYq());
      }
      i = b.a.a.a.fh(5, this.uwy);
      int j = b.a.a.a.fh(6, this.uwz);
      int k = b.a.a.a.fh(7, this.uwA);
      GMTrace.o(3709241131008L, 27636);
      return paramInt + i + j + k;
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
      if (this.tSa == null) {
        throw new b("Not all required fields were included: SessionKey");
      }
      if (this.uww == null) {
        throw new b("Not all required fields were included: SessionBuffer");
      }
      if (this.uwx == null) {
        throw new b("Not all required fields were included: KeyBuffer");
      }
      GMTrace.o(3709241131008L, 27636);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aha localaha = (aha)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3709241131008L, 27636);
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
          localaha.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3709241131008L, 27636);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaha.tSa = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3709241131008L, 27636);
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
          localaha.uww = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3709241131008L, 27636);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaha.uwx = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3709241131008L, 27636);
        return 0;
      case 5: 
        localaha.uwy = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3709241131008L, 27636);
        return 0;
      case 6: 
        localaha.uwz = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3709241131008L, 27636);
        return 0;
      }
      localaha.uwA = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3709241131008L, 27636);
      return 0;
    }
    GMTrace.o(3709241131008L, 27636);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */