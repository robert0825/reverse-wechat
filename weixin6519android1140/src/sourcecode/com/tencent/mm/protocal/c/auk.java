package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class auk
  extends azh
{
  public String tYP;
  public int tYQ;
  public String tYR;
  public LinkedList<rz> uJI;
  public LinkedList<ar> uJJ;
  public int uJK;
  public int urD;
  
  public auk()
  {
    GMTrace.i(3934458478592L, 29314);
    this.uJI = new LinkedList();
    this.uJJ = new LinkedList();
    GMTrace.o(3934458478592L, 29314);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3934592696320L, 29315);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.urD);
      paramVarArgs.d(3, 8, this.uJI);
      if (this.tYP != null) {
        paramVarArgs.e(4, this.tYP);
      }
      paramVarArgs.fk(5, this.tYQ);
      if (this.tYR != null) {
        paramVarArgs.e(6, this.tYR);
      }
      paramVarArgs.d(7, 8, this.uJJ);
      paramVarArgs.fk(8, this.uJK);
      GMTrace.o(3934592696320L, 29315);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.urD) + b.a.a.a.c(3, 8, this.uJI);
      paramInt = i;
      if (this.tYP != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tYP);
      }
      i = paramInt + b.a.a.a.fh(5, this.tYQ);
      paramInt = i;
      if (this.tYR != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tYR);
      }
      i = b.a.a.a.c(7, 8, this.uJJ);
      int j = b.a.a.a.fh(8, this.uJK);
      GMTrace.o(3934592696320L, 29315);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uJI.clear();
      this.uJJ.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3934592696320L, 29315);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      auk localauk = (auk)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3934592696320L, 29315);
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
          localauk.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3934592696320L, 29315);
        return 0;
      case 2: 
        localauk.urD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3934592696320L, 29315);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new rz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((rz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localauk.uJI.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3934592696320L, 29315);
        return 0;
      case 4: 
        localauk.tYP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3934592696320L, 29315);
        return 0;
      case 5: 
        localauk.tYQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3934592696320L, 29315);
        return 0;
      case 6: 
        localauk.tYR = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3934592696320L, 29315);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ar();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ar)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localauk.uJJ.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3934592696320L, 29315);
        return 0;
      }
      localauk.uJK = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3934592696320L, 29315);
      return 0;
    }
    GMTrace.o(3934592696320L, 29315);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\auk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */