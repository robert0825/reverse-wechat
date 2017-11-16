package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bbb
  extends com.tencent.mm.bm.a
{
  public String gCA;
  public int gCB;
  public String gCC;
  public String gCG;
  public int gCx;
  public String gCy;
  public String gCz;
  public oo uAC;
  public int uAv;
  public String uAw;
  public String uAx;
  public String uAy;
  public int uAz;
  public String ubV;
  public String ubW;
  public azq ufy;
  public azq uxT;
  
  public bbb()
  {
    GMTrace.i(3979555635200L, 29650);
    GMTrace.o(3979555635200L, 29650);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3979689852928L, 29651);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ufy == null) {
        throw new b("Not all required fields were included: UserName");
      }
      if (this.uxT == null) {
        throw new b("Not all required fields were included: NickName");
      }
      if (this.ufy != null)
      {
        paramVarArgs.fm(1, this.ufy.aYq());
        this.ufy.a(paramVarArgs);
      }
      if (this.uxT != null)
      {
        paramVarArgs.fm(2, this.uxT.aYq());
        this.uxT.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.gCx);
      if (this.gCy != null) {
        paramVarArgs.e(4, this.gCy);
      }
      if (this.gCz != null) {
        paramVarArgs.e(5, this.gCz);
      }
      if (this.gCA != null) {
        paramVarArgs.e(6, this.gCA);
      }
      paramVarArgs.fk(7, this.gCB);
      paramVarArgs.fk(8, this.uAv);
      if (this.uAw != null) {
        paramVarArgs.e(9, this.uAw);
      }
      if (this.uAx != null) {
        paramVarArgs.e(10, this.uAx);
      }
      if (this.gCC != null) {
        paramVarArgs.e(11, this.gCC);
      }
      if (this.uAy != null) {
        paramVarArgs.e(12, this.uAy);
      }
      paramVarArgs.fk(13, this.uAz);
      if (this.gCG != null) {
        paramVarArgs.e(14, this.gCG);
      }
      if (this.uAC != null)
      {
        paramVarArgs.fm(15, this.uAC.aYq());
        this.uAC.a(paramVarArgs);
      }
      if (this.ubV != null) {
        paramVarArgs.e(16, this.ubV);
      }
      if (this.ubW != null) {
        paramVarArgs.e(17, this.ubW);
      }
      GMTrace.o(3979689852928L, 29651);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.ufy != null) {
        paramInt = b.a.a.a.fj(1, this.ufy.aYq()) + 0;
      }
      i = paramInt;
      if (this.uxT != null) {
        i = paramInt + b.a.a.a.fj(2, this.uxT.aYq());
      }
      i += b.a.a.a.fh(3, this.gCx);
      paramInt = i;
      if (this.gCy != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.gCy);
      }
      i = paramInt;
      if (this.gCz != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.gCz);
      }
      paramInt = i;
      if (this.gCA != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.gCA);
      }
      i = paramInt + b.a.a.a.fh(7, this.gCB) + b.a.a.a.fh(8, this.uAv);
      paramInt = i;
      if (this.uAw != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.uAw);
      }
      i = paramInt;
      if (this.uAx != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.uAx);
      }
      paramInt = i;
      if (this.gCC != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.gCC);
      }
      i = paramInt;
      if (this.uAy != null) {
        i = paramInt + b.a.a.b.b.a.f(12, this.uAy);
      }
      i += b.a.a.a.fh(13, this.uAz);
      paramInt = i;
      if (this.gCG != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.gCG);
      }
      i = paramInt;
      if (this.uAC != null) {
        i = paramInt + b.a.a.a.fj(15, this.uAC.aYq());
      }
      paramInt = i;
      if (this.ubV != null) {
        paramInt = i + b.a.a.b.b.a.f(16, this.ubV);
      }
      i = paramInt;
      if (this.ubW != null) {
        i = paramInt + b.a.a.b.b.a.f(17, this.ubW);
      }
      GMTrace.o(3979689852928L, 29651);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ufy == null) {
        throw new b("Not all required fields were included: UserName");
      }
      if (this.uxT == null) {
        throw new b("Not all required fields were included: NickName");
      }
      GMTrace.o(3979689852928L, 29651);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bbb localbbb = (bbb)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3979689852928L, 29651);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbbb.ufy = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3979689852928L, 29651);
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
          localbbb.uxT = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3979689852928L, 29651);
        return 0;
      case 3: 
        localbbb.gCx = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3979689852928L, 29651);
        return 0;
      case 4: 
        localbbb.gCy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3979689852928L, 29651);
        return 0;
      case 5: 
        localbbb.gCz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3979689852928L, 29651);
        return 0;
      case 6: 
        localbbb.gCA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3979689852928L, 29651);
        return 0;
      case 7: 
        localbbb.gCB = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3979689852928L, 29651);
        return 0;
      case 8: 
        localbbb.uAv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3979689852928L, 29651);
        return 0;
      case 9: 
        localbbb.uAw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3979689852928L, 29651);
        return 0;
      case 10: 
        localbbb.uAx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3979689852928L, 29651);
        return 0;
      case 11: 
        localbbb.gCC = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3979689852928L, 29651);
        return 0;
      case 12: 
        localbbb.uAy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3979689852928L, 29651);
        return 0;
      case 13: 
        localbbb.uAz = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3979689852928L, 29651);
        return 0;
      case 14: 
        localbbb.gCG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3979689852928L, 29651);
        return 0;
      case 15: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new oo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((oo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbbb.uAC = ((oo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3979689852928L, 29651);
        return 0;
      case 16: 
        localbbb.ubV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3979689852928L, 29651);
        return 0;
      }
      localbbb.ubW = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3979689852928L, 29651);
      return 0;
    }
    GMTrace.o(3979689852928L, 29651);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */