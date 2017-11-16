package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aeq
  extends azh
{
  public String aEe;
  public String kBN;
  public String kBP;
  public boolean kBY;
  public int kID;
  public LinkedList<uk> tPU;
  public LinkedList<bhn> tQq;
  public String uun;
  public bvr uuo;
  public LinkedList<bvt> uup;
  public LinkedList<bvs> uuq;
  public LinkedList<String> uur;
  public String uus;
  public String uut;
  public LinkedList<iv> uuu;
  public boolean uuv;
  
  public aeq()
  {
    GMTrace.i(3932310994944L, 29298);
    this.uup = new LinkedList();
    this.uuq = new LinkedList();
    this.uur = new LinkedList();
    this.tQq = new LinkedList();
    this.tPU = new LinkedList();
    this.uuu = new LinkedList();
    GMTrace.o(3932310994944L, 29298);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3932445212672L, 29299);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uun == null) {
        throw new b("Not all required fields were included: coverurl");
      }
      if (this.kBP == null) {
        throw new b("Not all required fields were included: motto");
      }
      if (this.uuo == null) {
        throw new b("Not all required fields were included: rankdesc");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.uun != null) {
        paramVarArgs.e(2, this.uun);
      }
      if (this.kBP != null) {
        paramVarArgs.e(3, this.kBP);
      }
      if (this.uuo != null)
      {
        paramVarArgs.fm(4, this.uuo.aYq());
        this.uuo.a(paramVarArgs);
      }
      paramVarArgs.d(5, 8, this.uup);
      paramVarArgs.d(6, 8, this.uuq);
      if (this.aEe != null) {
        paramVarArgs.e(7, this.aEe);
      }
      paramVarArgs.d(8, 1, this.uur);
      if (this.uus != null) {
        paramVarArgs.e(9, this.uus);
      }
      if (this.uut != null) {
        paramVarArgs.e(10, this.uut);
      }
      paramVarArgs.d(14, 8, this.tQq);
      paramVarArgs.d(15, 8, this.tPU);
      paramVarArgs.ah(16, this.kBY);
      paramVarArgs.d(17, 8, this.uuu);
      paramVarArgs.ah(18, this.uuv);
      paramVarArgs.fk(19, this.kID);
      if (this.kBN != null) {
        paramVarArgs.e(20, this.kBN);
      }
      GMTrace.o(3932445212672L, 29299);
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
      if (this.uun != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uun);
      }
      i = paramInt;
      if (this.kBP != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.kBP);
      }
      paramInt = i;
      if (this.uuo != null) {
        paramInt = i + b.a.a.a.fj(4, this.uuo.aYq());
      }
      i = paramInt + b.a.a.a.c(5, 8, this.uup) + b.a.a.a.c(6, 8, this.uuq);
      paramInt = i;
      if (this.aEe != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.aEe);
      }
      i = paramInt + b.a.a.a.c(8, 1, this.uur);
      paramInt = i;
      if (this.uus != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.uus);
      }
      i = paramInt;
      if (this.uut != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.uut);
      }
      i = i + b.a.a.a.c(14, 8, this.tQq) + b.a.a.a.c(15, 8, this.tPU) + (b.a.a.b.b.a.cK(16) + 1) + b.a.a.a.c(17, 8, this.uuu) + (b.a.a.b.b.a.cK(18) + 1) + b.a.a.a.fh(19, this.kID);
      paramInt = i;
      if (this.kBN != null) {
        paramInt = i + b.a.a.b.b.a.f(20, this.kBN);
      }
      GMTrace.o(3932445212672L, 29299);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uup.clear();
      this.uuq.clear();
      this.uur.clear();
      this.tQq.clear();
      this.tPU.clear();
      this.uuu.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uun == null) {
        throw new b("Not all required fields were included: coverurl");
      }
      if (this.kBP == null) {
        throw new b("Not all required fields were included: motto");
      }
      if (this.uuo == null) {
        throw new b("Not all required fields were included: rankdesc");
      }
      GMTrace.o(3932445212672L, 29299);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aeq localaeq = (aeq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 11: 
      case 12: 
      case 13: 
      default: 
        GMTrace.o(3932445212672L, 29299);
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
          localaeq.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3932445212672L, 29299);
        return 0;
      case 2: 
        localaeq.uun = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3932445212672L, 29299);
        return 0;
      case 3: 
        localaeq.kBP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3932445212672L, 29299);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bvr();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bvr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaeq.uuo = ((bvr)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3932445212672L, 29299);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bvt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bvt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaeq.uup.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3932445212672L, 29299);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bvs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bvs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaeq.uuq.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3932445212672L, 29299);
        return 0;
      case 7: 
        localaeq.aEe = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3932445212672L, 29299);
        return 0;
      case 8: 
        localaeq.uur.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(3932445212672L, 29299);
        return 0;
      case 9: 
        localaeq.uus = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3932445212672L, 29299);
        return 0;
      case 10: 
        localaeq.uut = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3932445212672L, 29299);
        return 0;
      case 14: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhn();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhn)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaeq.tQq.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3932445212672L, 29299);
        return 0;
      case 15: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new uk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((uk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaeq.tPU.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3932445212672L, 29299);
        return 0;
      case 16: 
        localaeq.kBY = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(3932445212672L, 29299);
        return 0;
      case 17: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new iv();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((iv)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaeq.uuu.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3932445212672L, 29299);
        return 0;
      case 18: 
        localaeq.uuv = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(3932445212672L, 29299);
        return 0;
      case 19: 
        localaeq.kID = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3932445212672L, 29299);
        return 0;
      }
      localaeq.kBN = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3932445212672L, 29299);
      return 0;
    }
    GMTrace.o(3932445212672L, 29299);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aeq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */