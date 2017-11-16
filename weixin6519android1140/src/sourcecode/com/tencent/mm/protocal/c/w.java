package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class w
  extends ayx
{
  public int aCN;
  public int offset;
  public String tMN;
  public int tMO;
  public int tMP;
  public String tMQ;
  public int type;
  
  public w()
  {
    GMTrace.i(3751519715328L, 27951);
    GMTrace.o(3751519715328L, 27951);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3751653933056L, 27952);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.aCN);
      paramVarArgs.fk(3, this.offset);
      paramVarArgs.fk(4, this.type);
      if (this.tMN != null) {
        paramVarArgs.e(5, this.tMN);
      }
      paramVarArgs.fk(6, this.tMO);
      paramVarArgs.fk(7, this.tMP);
      if (this.tMQ != null) {
        paramVarArgs.e(8, this.tMQ);
      }
      GMTrace.o(3751653933056L, 27952);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.aCN) + b.a.a.a.fh(3, this.offset) + b.a.a.a.fh(4, this.type);
      paramInt = i;
      if (this.tMN != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tMN);
      }
      i = paramInt + b.a.a.a.fh(6, this.tMO) + b.a.a.a.fh(7, this.tMP);
      paramInt = i;
      if (this.tMQ != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tMQ);
      }
      GMTrace.o(3751653933056L, 27952);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3751653933056L, 27952);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      w localw = (w)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3751653933056L, 27952);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localw.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3751653933056L, 27952);
        return 0;
      case 2: 
        localw.aCN = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3751653933056L, 27952);
        return 0;
      case 3: 
        localw.offset = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3751653933056L, 27952);
        return 0;
      case 4: 
        localw.type = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3751653933056L, 27952);
        return 0;
      case 5: 
        localw.tMN = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3751653933056L, 27952);
        return 0;
      case 6: 
        localw.tMO = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3751653933056L, 27952);
        return 0;
      case 7: 
        localw.tMP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3751653933056L, 27952);
        return 0;
      }
      localw.tMQ = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3751653933056L, 27952);
      return 0;
    }
    GMTrace.o(3751653933056L, 27952);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */