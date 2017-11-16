package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class td
  extends azh
{
  public int jNj;
  public LinkedList<te> tPE;
  public String ufz;
  public String ugx;
  
  public td()
  {
    GMTrace.i(4010828365824L, 29883);
    this.tPE = new LinkedList();
    GMTrace.o(4010828365824L, 29883);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4010962583552L, 29884);
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
      if (this.ugx != null) {
        paramVarArgs.e(2, this.ugx);
      }
      paramVarArgs.fk(3, this.jNj);
      paramVarArgs.d(4, 8, this.tPE);
      if (this.ufz != null) {
        paramVarArgs.e(5, this.ufz);
      }
      GMTrace.o(4010962583552L, 29884);
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
      if (this.ugx != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.ugx);
      }
      i = i + b.a.a.a.fh(3, this.jNj) + b.a.a.a.c(4, 8, this.tPE);
      paramInt = i;
      if (this.ufz != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.ufz);
      }
      GMTrace.o(4010962583552L, 29884);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tPE.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(4010962583552L, 29884);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      td localtd = (td)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4010962583552L, 29884);
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
          localtd.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4010962583552L, 29884);
        return 0;
      case 2: 
        localtd.ugx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4010962583552L, 29884);
        return 0;
      case 3: 
        localtd.jNj = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4010962583552L, 29884);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new te();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((te)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localtd.tPE.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4010962583552L, 29884);
        return 0;
      }
      localtd.ufz = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(4010962583552L, 29884);
      return 0;
    }
    GMTrace.o(4010962583552L, 29884);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\td.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */