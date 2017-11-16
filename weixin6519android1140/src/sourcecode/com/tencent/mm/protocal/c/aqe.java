package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aqe
  extends azh
{
  public int tNz;
  public int tXv;
  public azp uFZ;
  public azp uGa;
  public int uGb;
  public int uGc;
  public LinkedList<nk> uGd;
  
  public aqe()
  {
    GMTrace.i(13579747065856L, 101177);
    this.uGd = new LinkedList();
    GMTrace.o(13579747065856L, 101177);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13579881283584L, 101178);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uFZ == null) {
        throw new b("Not all required fields were included: CurrentSynckey");
      }
      if (this.uGa == null) {
        throw new b("Not all required fields were included: MaxSynckey");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.uFZ != null)
      {
        paramVarArgs.fm(2, this.uFZ.aYq());
        this.uFZ.a(paramVarArgs);
      }
      if (this.uGa != null)
      {
        paramVarArgs.fm(3, this.uGa.aYq());
        this.uGa.a(paramVarArgs);
      }
      paramVarArgs.fk(4, this.tXv);
      paramVarArgs.fk(5, this.uGb);
      paramVarArgs.fk(6, this.uGc);
      paramVarArgs.d(7, 8, this.uGd);
      paramVarArgs.fk(8, this.tNz);
      GMTrace.o(13579881283584L, 101178);
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
      if (this.uFZ != null) {
        paramInt = i + b.a.a.a.fj(2, this.uFZ.aYq());
      }
      i = paramInt;
      if (this.uGa != null) {
        i = paramInt + b.a.a.a.fj(3, this.uGa.aYq());
      }
      paramInt = b.a.a.a.fh(4, this.tXv);
      int j = b.a.a.a.fh(5, this.uGb);
      int k = b.a.a.a.fh(6, this.uGc);
      int m = b.a.a.a.c(7, 8, this.uGd);
      int n = b.a.a.a.fh(8, this.tNz);
      GMTrace.o(13579881283584L, 101178);
      return i + paramInt + j + k + m + n;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uGd.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uFZ == null) {
        throw new b("Not all required fields were included: CurrentSynckey");
      }
      if (this.uGa == null) {
        throw new b("Not all required fields were included: MaxSynckey");
      }
      GMTrace.o(13579881283584L, 101178);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aqe localaqe = (aqe)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13579881283584L, 101178);
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
          localaqe.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13579881283584L, 101178);
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
          localaqe.uFZ = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13579881283584L, 101178);
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
          localaqe.uGa = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13579881283584L, 101178);
        return 0;
      case 4: 
        localaqe.tXv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13579881283584L, 101178);
        return 0;
      case 5: 
        localaqe.uGb = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13579881283584L, 101178);
        return 0;
      case 6: 
        localaqe.uGc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13579881283584L, 101178);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new nk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((nk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaqe.uGd.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(13579881283584L, 101178);
        return 0;
      }
      localaqe.tNz = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(13579881283584L, 101178);
      return 0;
    }
    GMTrace.o(13579881283584L, 101178);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aqe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */