package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public class adi
  extends azh
{
  public String mmS;
  public LinkedList<bdy> utu;
  public int utv;
  public int utw;
  
  public adi()
  {
    GMTrace.i(20072395440128L, 149551);
    this.utu = new LinkedList();
    GMTrace.o(20072395440128L, 149551);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20072529657856L, 149552);
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
      paramVarArgs.d(2, 8, this.utu);
      if (this.mmS != null) {
        paramVarArgs.e(3, this.mmS);
      }
      paramVarArgs.fk(4, this.utv);
      paramVarArgs.fk(5, this.utw);
      GMTrace.o(20072529657856L, 149552);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 8, this.utu);
      paramInt = i;
      if (this.mmS != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.mmS);
      }
      i = b.a.a.a.fh(4, this.utv);
      int j = b.a.a.a.fh(5, this.utw);
      GMTrace.o(20072529657856L, 149552);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.utu.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(20072529657856L, 149552);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      adi localadi = (adi)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(20072529657856L, 149552);
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
          localadi.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(20072529657856L, 149552);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bdy();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bdy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localadi.utu.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(20072529657856L, 149552);
        return 0;
      case 3: 
        localadi.mmS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20072529657856L, 149552);
        return 0;
      case 4: 
        localadi.utv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(20072529657856L, 149552);
        return 0;
      }
      localadi.utw = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(20072529657856L, 149552);
      return 0;
    }
    GMTrace.o(20072529657856L, 149552);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\adi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */