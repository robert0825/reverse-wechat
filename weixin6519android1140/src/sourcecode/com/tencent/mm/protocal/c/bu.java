package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bu
  extends com.tencent.mm.bm.a
{
  public int jhA;
  public int lQc;
  public int nFd;
  public int tPV;
  public azq tPW;
  public azq tPX;
  public azq tPY;
  public int tPZ;
  public azp tQa;
  public String tQb;
  public String tQc;
  public long tQd;
  public int tQe;
  
  public bu()
  {
    GMTrace.i(13575586316288L, 101146);
    GMTrace.o(13575586316288L, 101146);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13575720534016L, 101147);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tPW == null) {
        throw new b("Not all required fields were included: FromUserName");
      }
      if (this.tPX == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      if (this.tPY == null) {
        throw new b("Not all required fields were included: Content");
      }
      if (this.tQa == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      paramVarArgs.fk(1, this.tPV);
      if (this.tPW != null)
      {
        paramVarArgs.fm(2, this.tPW.aYq());
        this.tPW.a(paramVarArgs);
      }
      if (this.tPX != null)
      {
        paramVarArgs.fm(3, this.tPX.aYq());
        this.tPX.a(paramVarArgs);
      }
      paramVarArgs.fk(4, this.lQc);
      if (this.tPY != null)
      {
        paramVarArgs.fm(5, this.tPY.aYq());
        this.tPY.a(paramVarArgs);
      }
      paramVarArgs.fk(6, this.jhA);
      paramVarArgs.fk(7, this.tPZ);
      if (this.tQa != null)
      {
        paramVarArgs.fm(8, this.tQa.aYq());
        this.tQa.a(paramVarArgs);
      }
      paramVarArgs.fk(9, this.nFd);
      if (this.tQb != null) {
        paramVarArgs.e(10, this.tQb);
      }
      if (this.tQc != null) {
        paramVarArgs.e(11, this.tQc);
      }
      paramVarArgs.T(12, this.tQd);
      paramVarArgs.fk(13, this.tQe);
      GMTrace.o(13575720534016L, 101147);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.tPV) + 0;
      paramInt = i;
      if (this.tPW != null) {
        paramInt = i + b.a.a.a.fj(2, this.tPW.aYq());
      }
      i = paramInt;
      if (this.tPX != null) {
        i = paramInt + b.a.a.a.fj(3, this.tPX.aYq());
      }
      i += b.a.a.a.fh(4, this.lQc);
      paramInt = i;
      if (this.tPY != null) {
        paramInt = i + b.a.a.a.fj(5, this.tPY.aYq());
      }
      i = paramInt + b.a.a.a.fh(6, this.jhA) + b.a.a.a.fh(7, this.tPZ);
      paramInt = i;
      if (this.tQa != null) {
        paramInt = i + b.a.a.a.fj(8, this.tQa.aYq());
      }
      i = paramInt + b.a.a.a.fh(9, this.nFd);
      paramInt = i;
      if (this.tQb != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.tQb);
      }
      i = paramInt;
      if (this.tQc != null) {
        i = paramInt + b.a.a.b.b.a.f(11, this.tQc);
      }
      paramInt = b.a.a.a.S(12, this.tQd);
      int j = b.a.a.a.fh(13, this.tQe);
      GMTrace.o(13575720534016L, 101147);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tPW == null) {
        throw new b("Not all required fields were included: FromUserName");
      }
      if (this.tPX == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      if (this.tPY == null) {
        throw new b("Not all required fields were included: Content");
      }
      if (this.tQa == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      GMTrace.o(13575720534016L, 101147);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bu localbu = (bu)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13575720534016L, 101147);
        return -1;
      case 1: 
        localbu.tPV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13575720534016L, 101147);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbu.tPW = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13575720534016L, 101147);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbu.tPX = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13575720534016L, 101147);
        return 0;
      case 4: 
        localbu.lQc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13575720534016L, 101147);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbu.tPY = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13575720534016L, 101147);
        return 0;
      case 6: 
        localbu.jhA = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13575720534016L, 101147);
        return 0;
      case 7: 
        localbu.tPZ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13575720534016L, 101147);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbu.tQa = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13575720534016L, 101147);
        return 0;
      case 9: 
        localbu.nFd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13575720534016L, 101147);
        return 0;
      case 10: 
        localbu.tQb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13575720534016L, 101147);
        return 0;
      case 11: 
        localbu.tQc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13575720534016L, 101147);
        return 0;
      case 12: 
        localbu.tQd = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(13575720534016L, 101147);
        return 0;
      }
      localbu.tQe = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(13575720534016L, 101147);
      return 0;
    }
    GMTrace.o(13575720534016L, 101147);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */