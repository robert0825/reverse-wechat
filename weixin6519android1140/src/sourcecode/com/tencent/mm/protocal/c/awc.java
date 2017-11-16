package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class awc
  extends azh
{
  public int jWs;
  public String jWt;
  public String lAr;
  public int mFu;
  public String ojG;
  public String ojH;
  public int state;
  public String uLA;
  public String uLB;
  public String uLC;
  public String uLx;
  public int uLy;
  public String uLz;
  
  public awc()
  {
    GMTrace.i(20860924592128L, 155426);
    GMTrace.o(20860924592128L, 155426);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20861058809856L, 155427);
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
      paramVarArgs.fk(2, this.jWs);
      if (this.jWt != null) {
        paramVarArgs.e(3, this.jWt);
      }
      paramVarArgs.fk(4, this.state);
      if (this.uLx != null) {
        paramVarArgs.e(5, this.uLx);
      }
      paramVarArgs.fk(6, this.mFu);
      paramVarArgs.fk(7, this.uLy);
      if (this.ojG != null) {
        paramVarArgs.e(8, this.ojG);
      }
      if (this.uLz != null) {
        paramVarArgs.e(9, this.uLz);
      }
      if (this.ojH != null) {
        paramVarArgs.e(10, this.ojH);
      }
      if (this.uLA != null) {
        paramVarArgs.e(11, this.uLA);
      }
      if (this.uLB != null) {
        paramVarArgs.e(12, this.uLB);
      }
      if (this.uLC != null) {
        paramVarArgs.e(14, this.uLC);
      }
      if (this.lAr != null) {
        paramVarArgs.e(15, this.lAr);
      }
      GMTrace.o(20861058809856L, 155427);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jWs);
      paramInt = i;
      if (this.jWt != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.jWt);
      }
      i = paramInt + b.a.a.a.fh(4, this.state);
      paramInt = i;
      if (this.uLx != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uLx);
      }
      i = paramInt + b.a.a.a.fh(6, this.mFu) + b.a.a.a.fh(7, this.uLy);
      paramInt = i;
      if (this.ojG != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.ojG);
      }
      i = paramInt;
      if (this.uLz != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.uLz);
      }
      paramInt = i;
      if (this.ojH != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.ojH);
      }
      i = paramInt;
      if (this.uLA != null) {
        i = paramInt + b.a.a.b.b.a.f(11, this.uLA);
      }
      paramInt = i;
      if (this.uLB != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.uLB);
      }
      i = paramInt;
      if (this.uLC != null) {
        i = paramInt + b.a.a.b.b.a.f(14, this.uLC);
      }
      paramInt = i;
      if (this.lAr != null) {
        paramInt = i + b.a.a.b.b.a.f(15, this.lAr);
      }
      GMTrace.o(20861058809856L, 155427);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(20861058809856L, 155427);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      awc localawc = (awc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      case 13: 
      default: 
        GMTrace.o(20861058809856L, 155427);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localawc.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(20861058809856L, 155427);
        return 0;
      case 2: 
        localawc.jWs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(20861058809856L, 155427);
        return 0;
      case 3: 
        localawc.jWt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20861058809856L, 155427);
        return 0;
      case 4: 
        localawc.state = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(20861058809856L, 155427);
        return 0;
      case 5: 
        localawc.uLx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20861058809856L, 155427);
        return 0;
      case 6: 
        localawc.mFu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(20861058809856L, 155427);
        return 0;
      case 7: 
        localawc.uLy = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(20861058809856L, 155427);
        return 0;
      case 8: 
        localawc.ojG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20861058809856L, 155427);
        return 0;
      case 9: 
        localawc.uLz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20861058809856L, 155427);
        return 0;
      case 10: 
        localawc.ojH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20861058809856L, 155427);
        return 0;
      case 11: 
        localawc.uLA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20861058809856L, 155427);
        return 0;
      case 12: 
        localawc.uLB = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20861058809856L, 155427);
        return 0;
      case 14: 
        localawc.uLC = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20861058809856L, 155427);
        return 0;
      }
      localawc.lAr = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(20861058809856L, 155427);
      return 0;
    }
    GMTrace.o(20861058809856L, 155427);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\awc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */