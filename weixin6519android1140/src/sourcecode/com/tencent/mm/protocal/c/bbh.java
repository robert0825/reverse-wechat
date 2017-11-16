package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bbh
  extends ayx
{
  public String gCA;
  public int tRF;
  public int tYH;
  public cv uOF;
  public String uOG;
  public String uOH;
  public int uOI;
  public int ugP;
  public String ugy;
  
  public bbh()
  {
    GMTrace.i(3725481476096L, 27757);
    GMTrace.o(3725481476096L, 27757);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3725615693824L, 27758);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uOF == null) {
        throw new b("Not all required fields were included: Msg");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uOF != null)
      {
        paramVarArgs.fm(2, this.uOF.aYq());
        this.uOF.a(paramVarArgs);
      }
      if (this.uOG != null) {
        paramVarArgs.e(3, this.uOG);
      }
      paramVarArgs.fk(4, this.ugP);
      if (this.ugy != null) {
        paramVarArgs.e(5, this.ugy);
      }
      paramVarArgs.fk(6, this.tRF);
      if (this.gCA != null) {
        paramVarArgs.e(7, this.gCA);
      }
      if (this.uOH != null) {
        paramVarArgs.e(8, this.uOH);
      }
      paramVarArgs.fk(9, this.uOI);
      paramVarArgs.fk(10, this.tYH);
      GMTrace.o(3725615693824L, 27758);
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
      if (this.uOF != null) {
        paramInt = i + b.a.a.a.fj(2, this.uOF.aYq());
      }
      i = paramInt;
      if (this.uOG != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uOG);
      }
      i += b.a.a.a.fh(4, this.ugP);
      paramInt = i;
      if (this.ugy != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.ugy);
      }
      i = paramInt + b.a.a.a.fh(6, this.tRF);
      paramInt = i;
      if (this.gCA != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.gCA);
      }
      i = paramInt;
      if (this.uOH != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.uOH);
      }
      paramInt = b.a.a.a.fh(9, this.uOI);
      int j = b.a.a.a.fh(10, this.tYH);
      GMTrace.o(3725615693824L, 27758);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uOF == null) {
        throw new b("Not all required fields were included: Msg");
      }
      GMTrace.o(3725615693824L, 27758);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bbh localbbh = (bbh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3725615693824L, 27758);
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
          localbbh.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3725615693824L, 27758);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cv();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((cv)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbbh.uOF = ((cv)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3725615693824L, 27758);
        return 0;
      case 3: 
        localbbh.uOG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3725615693824L, 27758);
        return 0;
      case 4: 
        localbbh.ugP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3725615693824L, 27758);
        return 0;
      case 5: 
        localbbh.ugy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3725615693824L, 27758);
        return 0;
      case 6: 
        localbbh.tRF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3725615693824L, 27758);
        return 0;
      case 7: 
        localbbh.gCA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3725615693824L, 27758);
        return 0;
      case 8: 
        localbbh.uOH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3725615693824L, 27758);
        return 0;
      case 9: 
        localbbh.uOI = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3725615693824L, 27758);
        return 0;
      }
      localbbh.tYH = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3725615693824L, 27758);
      return 0;
    }
    GMTrace.o(3725615693824L, 27758);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bbh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */