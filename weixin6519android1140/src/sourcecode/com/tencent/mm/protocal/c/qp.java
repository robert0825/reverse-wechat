package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class qp
  extends com.tencent.mm.bm.a
{
  public String lPM;
  public String nFH;
  public String tRS;
  public String ugA;
  public String ugB;
  public String ugC;
  public String ugD;
  public String ugE;
  public String ugy;
  public String ugz;
  
  public qp()
  {
    GMTrace.i(3879831863296L, 28907);
    GMTrace.o(3879831863296L, 28907);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3879966081024L, 28908);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ugy == null) {
        throw new b("Not all required fields were included: Md5");
      }
      if (this.ugy != null) {
        paramVarArgs.e(1, this.ugy);
      }
      if (this.lPM != null) {
        paramVarArgs.e(2, this.lPM);
      }
      if (this.nFH != null) {
        paramVarArgs.e(3, this.nFH);
      }
      if (this.ugz != null) {
        paramVarArgs.e(4, this.ugz);
      }
      if (this.ugA != null) {
        paramVarArgs.e(5, this.ugA);
      }
      if (this.ugB != null) {
        paramVarArgs.e(6, this.ugB);
      }
      if (this.tRS != null) {
        paramVarArgs.e(7, this.tRS);
      }
      if (this.ugC != null) {
        paramVarArgs.e(8, this.ugC);
      }
      if (this.ugD != null) {
        paramVarArgs.e(9, this.ugD);
      }
      if (this.ugE != null) {
        paramVarArgs.e(10, this.ugE);
      }
      GMTrace.o(3879966081024L, 28908);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ugy == null) {
        break label862;
      }
    }
    label862:
    for (int i = b.a.a.b.b.a.f(1, this.ugy) + 0;; i = 0)
    {
      paramInt = i;
      if (this.lPM != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lPM);
      }
      i = paramInt;
      if (this.nFH != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.nFH);
      }
      paramInt = i;
      if (this.ugz != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ugz);
      }
      i = paramInt;
      if (this.ugA != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.ugA);
      }
      paramInt = i;
      if (this.ugB != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.ugB);
      }
      i = paramInt;
      if (this.tRS != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.tRS);
      }
      paramInt = i;
      if (this.ugC != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.ugC);
      }
      i = paramInt;
      if (this.ugD != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.ugD);
      }
      paramInt = i;
      if (this.ugE != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.ugE);
      }
      GMTrace.o(3879966081024L, 28908);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.ugy == null) {
          throw new b("Not all required fields were included: Md5");
        }
        GMTrace.o(3879966081024L, 28908);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        qp localqp = (qp)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3879966081024L, 28908);
          return -1;
        case 1: 
          localqp.ugy = locala.yqV.readString();
          GMTrace.o(3879966081024L, 28908);
          return 0;
        case 2: 
          localqp.lPM = locala.yqV.readString();
          GMTrace.o(3879966081024L, 28908);
          return 0;
        case 3: 
          localqp.nFH = locala.yqV.readString();
          GMTrace.o(3879966081024L, 28908);
          return 0;
        case 4: 
          localqp.ugz = locala.yqV.readString();
          GMTrace.o(3879966081024L, 28908);
          return 0;
        case 5: 
          localqp.ugA = locala.yqV.readString();
          GMTrace.o(3879966081024L, 28908);
          return 0;
        case 6: 
          localqp.ugB = locala.yqV.readString();
          GMTrace.o(3879966081024L, 28908);
          return 0;
        case 7: 
          localqp.tRS = locala.yqV.readString();
          GMTrace.o(3879966081024L, 28908);
          return 0;
        case 8: 
          localqp.ugC = locala.yqV.readString();
          GMTrace.o(3879966081024L, 28908);
          return 0;
        case 9: 
          localqp.ugD = locala.yqV.readString();
          GMTrace.o(3879966081024L, 28908);
          return 0;
        }
        localqp.ugE = locala.yqV.readString();
        GMTrace.o(3879966081024L, 28908);
        return 0;
      }
      GMTrace.o(3879966081024L, 28908);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\qp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */