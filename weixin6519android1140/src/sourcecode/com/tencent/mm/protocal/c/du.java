package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class du
  extends com.tencent.mm.bm.a
{
  public int kAW;
  public String tOC;
  public qm tRZ;
  public azp tSa;
  public azp tSb;
  public int tSc;
  public azp tSd;
  public bqq tSe;
  public buc tSf;
  public azp tSg;
  public azp tSh;
  public String tSi;
  public azp tSj;
  public String tSk;
  public bdz tSl;
  public String tSm;
  public int tSn;
  public int tSo;
  public int tSp;
  public int tSq;
  
  public du()
  {
    GMTrace.i(13584310468608L, 101211);
    GMTrace.o(13584310468608L, 101211);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13584444686336L, 101212);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tRZ == null) {
        throw new b("Not all required fields were included: SvrPubECDHKey");
      }
      if (this.tSa == null) {
        throw new b("Not all required fields were included: SessionKey");
      }
      if (this.tSb == null) {
        throw new b("Not all required fields were included: AutoAuthKey");
      }
      paramVarArgs.fk(1, this.kAW);
      if (this.tRZ != null)
      {
        paramVarArgs.fm(2, this.tRZ.aYq());
        this.tRZ.a(paramVarArgs);
      }
      if (this.tSa != null)
      {
        paramVarArgs.fm(3, this.tSa.aYq());
        this.tSa.a(paramVarArgs);
      }
      if (this.tSb != null)
      {
        paramVarArgs.fm(4, this.tSb.aYq());
        this.tSb.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.tSc);
      if (this.tSd != null)
      {
        paramVarArgs.fm(6, this.tSd.aYq());
        this.tSd.a(paramVarArgs);
      }
      if (this.tSe != null)
      {
        paramVarArgs.fm(7, this.tSe.aYq());
        this.tSe.a(paramVarArgs);
      }
      if (this.tSf != null)
      {
        paramVarArgs.fm(8, this.tSf.aYq());
        this.tSf.a(paramVarArgs);
      }
      if (this.tSg != null)
      {
        paramVarArgs.fm(9, this.tSg.aYq());
        this.tSg.a(paramVarArgs);
      }
      if (this.tSh != null)
      {
        paramVarArgs.fm(10, this.tSh.aYq());
        this.tSh.a(paramVarArgs);
      }
      if (this.tSi != null) {
        paramVarArgs.e(11, this.tSi);
      }
      if (this.tSj != null)
      {
        paramVarArgs.fm(12, this.tSj.aYq());
        this.tSj.a(paramVarArgs);
      }
      if (this.tSk != null) {
        paramVarArgs.e(14, this.tSk);
      }
      if (this.tSl != null)
      {
        paramVarArgs.fm(15, this.tSl.aYq());
        this.tSl.a(paramVarArgs);
      }
      if (this.tSm != null) {
        paramVarArgs.e(16, this.tSm);
      }
      paramVarArgs.fk(17, this.tSn);
      paramVarArgs.fk(18, this.tSo);
      paramVarArgs.fk(19, this.tSp);
      if (this.tOC != null) {
        paramVarArgs.e(20, this.tOC);
      }
      paramVarArgs.fk(21, this.tSq);
      GMTrace.o(13584444686336L, 101212);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.kAW) + 0;
      paramInt = i;
      if (this.tRZ != null) {
        paramInt = i + b.a.a.a.fj(2, this.tRZ.aYq());
      }
      i = paramInt;
      if (this.tSa != null) {
        i = paramInt + b.a.a.a.fj(3, this.tSa.aYq());
      }
      paramInt = i;
      if (this.tSb != null) {
        paramInt = i + b.a.a.a.fj(4, this.tSb.aYq());
      }
      i = paramInt + b.a.a.a.fh(5, this.tSc);
      paramInt = i;
      if (this.tSd != null) {
        paramInt = i + b.a.a.a.fj(6, this.tSd.aYq());
      }
      i = paramInt;
      if (this.tSe != null) {
        i = paramInt + b.a.a.a.fj(7, this.tSe.aYq());
      }
      paramInt = i;
      if (this.tSf != null) {
        paramInt = i + b.a.a.a.fj(8, this.tSf.aYq());
      }
      i = paramInt;
      if (this.tSg != null) {
        i = paramInt + b.a.a.a.fj(9, this.tSg.aYq());
      }
      paramInt = i;
      if (this.tSh != null) {
        paramInt = i + b.a.a.a.fj(10, this.tSh.aYq());
      }
      i = paramInt;
      if (this.tSi != null) {
        i = paramInt + b.a.a.b.b.a.f(11, this.tSi);
      }
      paramInt = i;
      if (this.tSj != null) {
        paramInt = i + b.a.a.a.fj(12, this.tSj.aYq());
      }
      i = paramInt;
      if (this.tSk != null) {
        i = paramInt + b.a.a.b.b.a.f(14, this.tSk);
      }
      paramInt = i;
      if (this.tSl != null) {
        paramInt = i + b.a.a.a.fj(15, this.tSl.aYq());
      }
      i = paramInt;
      if (this.tSm != null) {
        i = paramInt + b.a.a.b.b.a.f(16, this.tSm);
      }
      i = i + b.a.a.a.fh(17, this.tSn) + b.a.a.a.fh(18, this.tSo) + b.a.a.a.fh(19, this.tSp);
      paramInt = i;
      if (this.tOC != null) {
        paramInt = i + b.a.a.b.b.a.f(20, this.tOC);
      }
      i = b.a.a.a.fh(21, this.tSq);
      GMTrace.o(13584444686336L, 101212);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tRZ == null) {
        throw new b("Not all required fields were included: SvrPubECDHKey");
      }
      if (this.tSa == null) {
        throw new b("Not all required fields were included: SessionKey");
      }
      if (this.tSb == null) {
        throw new b("Not all required fields were included: AutoAuthKey");
      }
      GMTrace.o(13584444686336L, 101212);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      du localdu = (du)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 13: 
      default: 
        GMTrace.o(13584444686336L, 101212);
        return -1;
      case 1: 
        localdu.kAW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13584444686336L, 101212);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new qm();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((qm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localdu.tRZ = ((qm)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13584444686336L, 101212);
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
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localdu.tSa = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13584444686336L, 101212);
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
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localdu.tSb = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13584444686336L, 101212);
        return 0;
      case 5: 
        localdu.tSc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13584444686336L, 101212);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localdu.tSd = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13584444686336L, 101212);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bqq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bqq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localdu.tSe = ((bqq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13584444686336L, 101212);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new buc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((buc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localdu.tSf = ((buc)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13584444686336L, 101212);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localdu.tSg = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13584444686336L, 101212);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localdu.tSh = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13584444686336L, 101212);
        return 0;
      case 11: 
        localdu.tSi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13584444686336L, 101212);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localdu.tSj = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13584444686336L, 101212);
        return 0;
      case 14: 
        localdu.tSk = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13584444686336L, 101212);
        return 0;
      case 15: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bdz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bdz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localdu.tSl = ((bdz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13584444686336L, 101212);
        return 0;
      case 16: 
        localdu.tSm = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13584444686336L, 101212);
        return 0;
      case 17: 
        localdu.tSn = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13584444686336L, 101212);
        return 0;
      case 18: 
        localdu.tSo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13584444686336L, 101212);
        return 0;
      case 19: 
        localdu.tSp = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13584444686336L, 101212);
        return 0;
      case 20: 
        localdu.tOC = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13584444686336L, 101212);
        return 0;
      }
      localdu.tSq = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(13584444686336L, 101212);
      return 0;
    }
    GMTrace.o(13584444686336L, 101212);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\du.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */