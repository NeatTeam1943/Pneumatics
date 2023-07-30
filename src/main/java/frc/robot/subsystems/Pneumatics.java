// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.CylinderConstants;

public class Pneumatics extends SubsystemBase {
  Compressor m_compressor;
  Solenoid m_solenoid;

  public Pneumatics() {
    m_compressor = new Compressor(CylinderConstants.kCompressorPort, PneumaticsModuleType.CTREPCM);
    m_solenoid = new Solenoid(PneumaticsModuleType.CTREPCM, CylinderConstants.kSolenoidChannle);

    m_compressor.disable();
    m_compressor.enableDigital();
  }

  public void toggleSolenoid(){
    m_solenoid.toggle();
  }

  @Override
  public void periodic() {
  }
}
