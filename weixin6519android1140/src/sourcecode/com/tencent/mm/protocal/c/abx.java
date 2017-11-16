package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class abx
  extends azh
{
  public String lPM;
  public int tMX;
  public String tNn;
  public String tXx;
  public String ulE;
  public azp urP;
  public String urY;
  public int urZ;
  public int usu;
  public LinkedList<ary> usv;
  public int usw;
  
  public abx()
  {
    GMTrace.i(3997675028480L, 29785);
    this.usv = new LinkedList();
    GMTrace.o(3997675028480L, 29785);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3997809246208L, 29786);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.urP == null) {
        throw new b("Not all required fields were included: Buff");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.usu);
      paramVarArgs.d(3, 8, this.usv);
      paramVarArgs.fk(4, this.tMX);
      paramVarArgs.fk(5, this.usw);
      if (this.urP != null)
      {
        paramVarArgs.fm(6, this.urP.aYq());
        this.urP.a(paramVarArgs);
      }
      if (this.lPM != null) {
        paramVarArgs.e(7, this.lPM);
      }
      if (this.urY != null) {
        paramVarArgs.e(8, this.urY);
      }
      if (this.ulE != null) {
        paramVarArgs.e(9, this.ulE);
      }
      if (this.tNn != null) {
        paramVarArgs.e(10, this.tNn);
      }
      paramVarArgs.fk(11, this.urZ);
      if (this.tXx != null) {
        paramVarArgs.e(12, this.tXx);
      }
      GMTrace.o(3997809246208L, 29786);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.usu) + b.a.a.a.c(3, 8, this.usv) + b.a.a.a.fh(4, this.tMX) + b.a.a.a.fh(5, this.usw);
      paramInt = i;
      if (this.urP != null) {
        paramInt = i + b.a.a.a.fj(6, this.urP.aYq());
      }
      i = paramInt;
      if (this.lPM != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.lPM);
      }
      paramInt = i;
      if (this.urY != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.urY);
      }
      i = paramInt;
      if (this.ulE != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.ulE);
      }
      paramInt = i;
      if (this.tNn != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.tNn);
      }
      i = paramInt + b.a.a.a.fh(11, this.urZ);
      paramInt = i;
      if (this.tXx != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.tXx);
      }
      GMTrace.o(3997809246208L, 29786);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.usv.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.urP == null) {
        throw new b("Not all required fields were included: Buff");
      }
      GMTrace.o(3997809246208L, 29786);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      abx localabx = (abx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3997809246208L, 29786);
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
          localabx.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3997809246208L, 29786);
        return 0;
      case 2: 
        localabx.usu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3997809246208L, 29786);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ary();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ary)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localabx.usv.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3997809246208L, 29786);
        return 0;
      case 4: 
        localabx.tMX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3997809246208L, 29786);
        return 0;
      case 5: 
        localabx.usw = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3997809246208L, 29786);
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
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localabx.urP = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3997809246208L, 29786);
        return 0;
      case 7: 
        localabx.lPM = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3997809246208L, 29786);
        return 0;
      case 8: 
        localabx.urY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3997809246208L, 29786);
        return 0;
      case 9: 
        localabx.ulE = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3997809246208L, 29786);
        return 0;
      case 10: 
        localabx.tNn = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3997809246208L, 29786);
        return 0;
      case 11: 
        localabx.urZ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3997809246208L, 29786);
        return 0;
      }
      localabx.tXx = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3997809246208L, 29786);
      return 0;
    }
    GMTrace.o(3997809246208L, 29786);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\abx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */