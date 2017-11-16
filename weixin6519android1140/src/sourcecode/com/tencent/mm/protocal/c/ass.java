package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ass
  extends azh
{
  public int eGy;
  public String eGz;
  public int mRi;
  public String rjn;
  public bqr uIA;
  public bqu uIB;
  public boolean uIC;
  public LinkedList<String> uID;
  public bqw uIy;
  public bqt uIz;
  
  public ass()
  {
    GMTrace.i(3910299287552L, 29134);
    this.uID = new LinkedList();
    GMTrace.o(3910299287552L, 29134);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3910433505280L, 29135);
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
      paramVarArgs.fk(2, this.eGy);
      if (this.eGz != null) {
        paramVarArgs.e(3, this.eGz);
      }
      if (this.uIy != null)
      {
        paramVarArgs.fm(4, this.uIy.aYq());
        this.uIy.a(paramVarArgs);
      }
      if (this.uIz != null)
      {
        paramVarArgs.fm(5, this.uIz.aYq());
        this.uIz.a(paramVarArgs);
      }
      if (this.uIA != null)
      {
        paramVarArgs.fm(6, this.uIA.aYq());
        this.uIA.a(paramVarArgs);
      }
      if (this.uIB != null)
      {
        paramVarArgs.fm(7, this.uIB.aYq());
        this.uIB.a(paramVarArgs);
      }
      paramVarArgs.fk(8, this.mRi);
      paramVarArgs.ah(9, this.uIC);
      if (this.rjn != null) {
        paramVarArgs.e(10, this.rjn);
      }
      paramVarArgs.d(11, 1, this.uID);
      GMTrace.o(3910433505280L, 29135);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.eGy);
      paramInt = i;
      if (this.eGz != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.eGz);
      }
      i = paramInt;
      if (this.uIy != null) {
        i = paramInt + b.a.a.a.fj(4, this.uIy.aYq());
      }
      paramInt = i;
      if (this.uIz != null) {
        paramInt = i + b.a.a.a.fj(5, this.uIz.aYq());
      }
      i = paramInt;
      if (this.uIA != null) {
        i = paramInt + b.a.a.a.fj(6, this.uIA.aYq());
      }
      paramInt = i;
      if (this.uIB != null) {
        paramInt = i + b.a.a.a.fj(7, this.uIB.aYq());
      }
      i = paramInt + b.a.a.a.fh(8, this.mRi) + (b.a.a.b.b.a.cK(9) + 1);
      paramInt = i;
      if (this.rjn != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.rjn);
      }
      i = b.a.a.a.c(11, 1, this.uID);
      GMTrace.o(3910433505280L, 29135);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uID.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3910433505280L, 29135);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ass localass = (ass)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3910433505280L, 29135);
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
          localass.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3910433505280L, 29135);
        return 0;
      case 2: 
        localass.eGy = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3910433505280L, 29135);
        return 0;
      case 3: 
        localass.eGz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3910433505280L, 29135);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bqw();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bqw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localass.uIy = ((bqw)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3910433505280L, 29135);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bqt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bqt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localass.uIz = ((bqt)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3910433505280L, 29135);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bqr();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bqr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localass.uIA = ((bqr)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3910433505280L, 29135);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bqu();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bqu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localass.uIB = ((bqu)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3910433505280L, 29135);
        return 0;
      case 8: 
        localass.mRi = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3910433505280L, 29135);
        return 0;
      case 9: 
        localass.uIC = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(3910433505280L, 29135);
        return 0;
      case 10: 
        localass.rjn = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3910433505280L, 29135);
        return 0;
      }
      localass.uID.add(((b.a.a.a.a)localObject1).yqV.readString());
      GMTrace.o(3910433505280L, 29135);
      return 0;
    }
    GMTrace.o(3910433505280L, 29135);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ass.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */