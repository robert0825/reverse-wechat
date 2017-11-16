package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class rd
  extends com.tencent.mm.bm.a
{
  public int jia;
  public String lRV;
  public String tRS;
  public String uhe;
  public String uhf;
  public String uhg;
  public String uhh;
  public int uhi;
  public int uhj;
  public int uhk;
  public LinkedList<azq> uhl;
  public String uhm;
  public int uhn;
  public String uho;
  public String uhp;
  public String uhq;
  public String uhr;
  public String uhs;
  public int uht;
  public LinkedList<asa> uhu;
  public String uhv;
  public String uhw;
  public String uhx;
  public rc uhy;
  public ato uhz;
  
  public rd()
  {
    GMTrace.i(3832184569856L, 28552);
    this.uhl = new LinkedList();
    this.uhu = new LinkedList();
    GMTrace.o(3832184569856L, 28552);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3832318787584L, 28553);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tRS != null) {
        paramVarArgs.e(1, this.tRS);
      }
      if (this.lRV != null) {
        paramVarArgs.e(2, this.lRV);
      }
      if (this.uhe != null) {
        paramVarArgs.e(3, this.uhe);
      }
      if (this.uhf != null) {
        paramVarArgs.e(4, this.uhf);
      }
      if (this.uhg != null) {
        paramVarArgs.e(5, this.uhg);
      }
      if (this.uhh != null) {
        paramVarArgs.e(6, this.uhh);
      }
      paramVarArgs.fk(7, this.uhi);
      paramVarArgs.fk(8, this.uhj);
      paramVarArgs.fk(9, this.uhk);
      paramVarArgs.d(10, 8, this.uhl);
      if (this.uhm != null) {
        paramVarArgs.e(11, this.uhm);
      }
      paramVarArgs.fk(12, this.uhn);
      if (this.uho != null) {
        paramVarArgs.e(13, this.uho);
      }
      if (this.uhp != null) {
        paramVarArgs.e(14, this.uhp);
      }
      if (this.uhq != null) {
        paramVarArgs.e(15, this.uhq);
      }
      if (this.uhr != null) {
        paramVarArgs.e(16, this.uhr);
      }
      if (this.uhs != null) {
        paramVarArgs.e(17, this.uhs);
      }
      paramVarArgs.fk(18, this.uht);
      paramVarArgs.d(19, 8, this.uhu);
      paramVarArgs.fk(20, this.jia);
      if (this.uhv != null) {
        paramVarArgs.e(21, this.uhv);
      }
      if (this.uhw != null) {
        paramVarArgs.e(22, this.uhw);
      }
      if (this.uhx != null) {
        paramVarArgs.e(23, this.uhx);
      }
      if (this.uhy != null)
      {
        paramVarArgs.fm(24, this.uhy.aYq());
        this.uhy.a(paramVarArgs);
      }
      if (this.uhz != null)
      {
        paramVarArgs.fm(25, this.uhz.aYq());
        this.uhz.a(paramVarArgs);
      }
      GMTrace.o(3832318787584L, 28553);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.tRS != null) {
        i = b.a.a.b.b.a.f(1, this.tRS) + 0;
      }
      paramInt = i;
      if (this.lRV != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lRV);
      }
      i = paramInt;
      if (this.uhe != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uhe);
      }
      paramInt = i;
      if (this.uhf != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uhf);
      }
      i = paramInt;
      if (this.uhg != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uhg);
      }
      paramInt = i;
      if (this.uhh != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uhh);
      }
      i = paramInt + b.a.a.a.fh(7, this.uhi) + b.a.a.a.fh(8, this.uhj) + b.a.a.a.fh(9, this.uhk) + b.a.a.a.c(10, 8, this.uhl);
      paramInt = i;
      if (this.uhm != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.uhm);
      }
      i = paramInt + b.a.a.a.fh(12, this.uhn);
      paramInt = i;
      if (this.uho != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.uho);
      }
      i = paramInt;
      if (this.uhp != null) {
        i = paramInt + b.a.a.b.b.a.f(14, this.uhp);
      }
      paramInt = i;
      if (this.uhq != null) {
        paramInt = i + b.a.a.b.b.a.f(15, this.uhq);
      }
      i = paramInt;
      if (this.uhr != null) {
        i = paramInt + b.a.a.b.b.a.f(16, this.uhr);
      }
      paramInt = i;
      if (this.uhs != null) {
        paramInt = i + b.a.a.b.b.a.f(17, this.uhs);
      }
      i = paramInt + b.a.a.a.fh(18, this.uht) + b.a.a.a.c(19, 8, this.uhu) + b.a.a.a.fh(20, this.jia);
      paramInt = i;
      if (this.uhv != null) {
        paramInt = i + b.a.a.b.b.a.f(21, this.uhv);
      }
      i = paramInt;
      if (this.uhw != null) {
        i = paramInt + b.a.a.b.b.a.f(22, this.uhw);
      }
      paramInt = i;
      if (this.uhx != null) {
        paramInt = i + b.a.a.b.b.a.f(23, this.uhx);
      }
      i = paramInt;
      if (this.uhy != null) {
        i = paramInt + b.a.a.a.fj(24, this.uhy.aYq());
      }
      paramInt = i;
      if (this.uhz != null) {
        paramInt = i + b.a.a.a.fj(25, this.uhz.aYq());
      }
      GMTrace.o(3832318787584L, 28553);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uhl.clear();
      this.uhu.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3832318787584L, 28553);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      rd localrd = (rd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3832318787584L, 28553);
        return -1;
      case 1: 
        localrd.tRS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3832318787584L, 28553);
        return 0;
      case 2: 
        localrd.lRV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3832318787584L, 28553);
        return 0;
      case 3: 
        localrd.uhe = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3832318787584L, 28553);
        return 0;
      case 4: 
        localrd.uhf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3832318787584L, 28553);
        return 0;
      case 5: 
        localrd.uhg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3832318787584L, 28553);
        return 0;
      case 6: 
        localrd.uhh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3832318787584L, 28553);
        return 0;
      case 7: 
        localrd.uhi = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3832318787584L, 28553);
        return 0;
      case 8: 
        localrd.uhj = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3832318787584L, 28553);
        return 0;
      case 9: 
        localrd.uhk = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3832318787584L, 28553);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localrd.uhl.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3832318787584L, 28553);
        return 0;
      case 11: 
        localrd.uhm = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3832318787584L, 28553);
        return 0;
      case 12: 
        localrd.uhn = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3832318787584L, 28553);
        return 0;
      case 13: 
        localrd.uho = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3832318787584L, 28553);
        return 0;
      case 14: 
        localrd.uhp = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3832318787584L, 28553);
        return 0;
      case 15: 
        localrd.uhq = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3832318787584L, 28553);
        return 0;
      case 16: 
        localrd.uhr = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3832318787584L, 28553);
        return 0;
      case 17: 
        localrd.uhs = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3832318787584L, 28553);
        return 0;
      case 18: 
        localrd.uht = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3832318787584L, 28553);
        return 0;
      case 19: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new asa();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((asa)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localrd.uhu.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3832318787584L, 28553);
        return 0;
      case 20: 
        localrd.jia = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3832318787584L, 28553);
        return 0;
      case 21: 
        localrd.uhv = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3832318787584L, 28553);
        return 0;
      case 22: 
        localrd.uhw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3832318787584L, 28553);
        return 0;
      case 23: 
        localrd.uhx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3832318787584L, 28553);
        return 0;
      case 24: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new rc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((rc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localrd.uhy = ((rc)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3832318787584L, 28553);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ato();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((ato)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localrd.uhz = ((ato)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3832318787584L, 28553);
      return 0;
    }
    GMTrace.o(3832318787584L, 28553);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\rd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */