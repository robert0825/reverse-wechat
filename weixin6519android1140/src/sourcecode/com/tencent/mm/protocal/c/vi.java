package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class vi
  extends ayx
{
  public String lQa;
  public String lTe;
  public String lTj;
  public int tMZ;
  public int tOG;
  public String tUz;
  public at tYT;
  public String ucv;
  public String udf;
  public String udg;
  public String udh;
  public String udi;
  public String unC;
  public String unD;
  
  public vi()
  {
    GMTrace.i(3830573957120L, 28540);
    GMTrace.o(3830573957120L, 28540);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3830708174848L, 28541);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.lQa != null) {
        paramVarArgs.e(2, this.lQa);
      }
      if (this.udf != null) {
        paramVarArgs.e(3, this.udf);
      }
      if (this.tUz != null) {
        paramVarArgs.e(4, this.tUz);
      }
      if (this.udg != null) {
        paramVarArgs.e(5, this.udg);
      }
      if (this.udh != null) {
        paramVarArgs.e(6, this.udh);
      }
      if (this.udi != null) {
        paramVarArgs.e(7, this.udi);
      }
      if (this.ucv != null) {
        paramVarArgs.e(8, this.ucv);
      }
      if (this.unC != null) {
        paramVarArgs.e(9, this.unC);
      }
      paramVarArgs.fk(10, this.tMZ);
      if (this.lTj != null) {
        paramVarArgs.e(11, this.lTj);
      }
      if (this.lTe != null) {
        paramVarArgs.e(12, this.lTe);
      }
      if (this.unD != null) {
        paramVarArgs.e(13, this.unD);
      }
      if (this.tYT != null)
      {
        paramVarArgs.fm(14, this.tYT.aYq());
        this.tYT.a(paramVarArgs);
      }
      paramVarArgs.fk(15, this.tOG);
      GMTrace.o(3830708174848L, 28541);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.lQa != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lQa);
      }
      i = paramInt;
      if (this.udf != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.udf);
      }
      paramInt = i;
      if (this.tUz != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tUz);
      }
      i = paramInt;
      if (this.udg != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.udg);
      }
      paramInt = i;
      if (this.udh != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.udh);
      }
      i = paramInt;
      if (this.udi != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.udi);
      }
      paramInt = i;
      if (this.ucv != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.ucv);
      }
      i = paramInt;
      if (this.unC != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.unC);
      }
      i += b.a.a.a.fh(10, this.tMZ);
      paramInt = i;
      if (this.lTj != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.lTj);
      }
      i = paramInt;
      if (this.lTe != null) {
        i = paramInt + b.a.a.b.b.a.f(12, this.lTe);
      }
      paramInt = i;
      if (this.unD != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.unD);
      }
      i = paramInt;
      if (this.tYT != null) {
        i = paramInt + b.a.a.a.fj(14, this.tYT.aYq());
      }
      paramInt = b.a.a.a.fh(15, this.tOG);
      GMTrace.o(3830708174848L, 28541);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3830708174848L, 28541);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      vi localvi = (vi)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3830708174848L, 28541);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localvi.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3830708174848L, 28541);
        return 0;
      case 2: 
        localvi.lQa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3830708174848L, 28541);
        return 0;
      case 3: 
        localvi.udf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3830708174848L, 28541);
        return 0;
      case 4: 
        localvi.tUz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3830708174848L, 28541);
        return 0;
      case 5: 
        localvi.udg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3830708174848L, 28541);
        return 0;
      case 6: 
        localvi.udh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3830708174848L, 28541);
        return 0;
      case 7: 
        localvi.udi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3830708174848L, 28541);
        return 0;
      case 8: 
        localvi.ucv = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3830708174848L, 28541);
        return 0;
      case 9: 
        localvi.unC = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3830708174848L, 28541);
        return 0;
      case 10: 
        localvi.tMZ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3830708174848L, 28541);
        return 0;
      case 11: 
        localvi.lTj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3830708174848L, 28541);
        return 0;
      case 12: 
        localvi.lTe = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3830708174848L, 28541);
        return 0;
      case 13: 
        localvi.unD = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3830708174848L, 28541);
        return 0;
      case 14: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new at();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((at)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localvi.tYT = ((at)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3830708174848L, 28541);
        return 0;
      }
      localvi.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3830708174848L, 28541);
      return 0;
    }
    GMTrace.o(3830708174848L, 28541);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\vi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */