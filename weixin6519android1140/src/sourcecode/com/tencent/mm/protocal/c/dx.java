package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class dx
  extends ayx
{
  public String gCA;
  public String jhm;
  public String kBg;
  public String kBh;
  public azp tSb;
  public ep tSu;
  public String tSv;
  public String tSw;
  public int tSx;
  public String tSy;
  public String tSz;
  
  public dx()
  {
    GMTrace.i(13580552372224L, 101183);
    GMTrace.o(13580552372224L, 101183);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13580686589952L, 101184);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tSb == null) {
        throw new b("Not all required fields were included: AutoAuthKey");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tSu != null)
      {
        paramVarArgs.fm(2, this.tSu.aYq());
        this.tSu.a(paramVarArgs);
      }
      if (this.tSb != null)
      {
        paramVarArgs.fm(3, this.tSb.aYq());
        this.tSb.a(paramVarArgs);
      }
      if (this.tSv != null) {
        paramVarArgs.e(4, this.tSv);
      }
      if (this.tSw != null) {
        paramVarArgs.e(5, this.tSw);
      }
      paramVarArgs.fk(6, this.tSx);
      if (this.tSy != null) {
        paramVarArgs.e(7, this.tSy);
      }
      if (this.gCA != null) {
        paramVarArgs.e(8, this.gCA);
      }
      if (this.jhm != null) {
        paramVarArgs.e(9, this.jhm);
      }
      if (this.tSz != null) {
        paramVarArgs.e(10, this.tSz);
      }
      if (this.kBh != null) {
        paramVarArgs.e(11, this.kBh);
      }
      if (this.kBg != null) {
        paramVarArgs.e(12, this.kBg);
      }
      GMTrace.o(13580686589952L, 101184);
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
      if (this.tSu != null) {
        paramInt = i + b.a.a.a.fj(2, this.tSu.aYq());
      }
      i = paramInt;
      if (this.tSb != null) {
        i = paramInt + b.a.a.a.fj(3, this.tSb.aYq());
      }
      paramInt = i;
      if (this.tSv != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tSv);
      }
      i = paramInt;
      if (this.tSw != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tSw);
      }
      i += b.a.a.a.fh(6, this.tSx);
      paramInt = i;
      if (this.tSy != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tSy);
      }
      i = paramInt;
      if (this.gCA != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.gCA);
      }
      paramInt = i;
      if (this.jhm != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.jhm);
      }
      i = paramInt;
      if (this.tSz != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.tSz);
      }
      paramInt = i;
      if (this.kBh != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.kBh);
      }
      i = paramInt;
      if (this.kBg != null) {
        i = paramInt + b.a.a.b.b.a.f(12, this.kBg);
      }
      GMTrace.o(13580686589952L, 101184);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tSb == null) {
        throw new b("Not all required fields were included: AutoAuthKey");
      }
      GMTrace.o(13580686589952L, 101184);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      dx localdx = (dx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13580686589952L, 101184);
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
          localdx.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13580686589952L, 101184);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ep();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ep)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localdx.tSu = ((ep)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13580686589952L, 101184);
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
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localdx.tSb = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13580686589952L, 101184);
        return 0;
      case 4: 
        localdx.tSv = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13580686589952L, 101184);
        return 0;
      case 5: 
        localdx.tSw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13580686589952L, 101184);
        return 0;
      case 6: 
        localdx.tSx = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13580686589952L, 101184);
        return 0;
      case 7: 
        localdx.tSy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13580686589952L, 101184);
        return 0;
      case 8: 
        localdx.gCA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13580686589952L, 101184);
        return 0;
      case 9: 
        localdx.jhm = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13580686589952L, 101184);
        return 0;
      case 10: 
        localdx.tSz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13580686589952L, 101184);
        return 0;
      case 11: 
        localdx.kBh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13580686589952L, 101184);
        return 0;
      }
      localdx.kBg = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(13580686589952L, 101184);
      return 0;
    }
    GMTrace.o(13580686589952L, 101184);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\dx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */