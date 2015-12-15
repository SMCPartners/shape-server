package com.smcpartners.shape.frameworks.data.dao.shape.impl;

import com.diffplug.common.base.Errors;
import com.smcpartners.shape.frameworks.data.dao.shape.OrganizationMeasureDAO;
import com.smcpartners.shape.frameworks.data.entitymodel.shape.MeasureEntity;
import com.smcpartners.shape.frameworks.data.entitymodel.shape.OrganizationEntity;
import com.smcpartners.shape.frameworks.data.entitymodel.shape.OrganizationMeasureEntity;
import com.smcpartners.shape.frameworks.data.entitymodel.shape.UserEntity;
import com.smcpartners.shape.frameworks.data.exceptions.DataAccessException;
import com.smcpartners.shape.frameworks.producers.annotations.ShapeDatabase;
import com.smcpartners.shape.shared.dto.shape.OrganizationMeasureDTO;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

/**
 * Responsible:</br>
 * 1. </br>
 * <p>
 * <p>
 * Created by johndestefano on 10/29/15.
 * </p>
 * <p>
 * <p>
 * Changes:</br>
 * 1. </br>
 * </p>
 */
@Stateless
public class OrganizationMeasureDAOImpl extends AbstractCrudDAO<OrganizationMeasureDTO, OrganizationMeasureEntity, Integer> implements OrganizationMeasureDAO {

    /**
     * Constructor
     */
    @Inject
    public OrganizationMeasureDAOImpl(@ShapeDatabase EntityManager em) {
        this.em = em;
    }

    @Override
    public List<OrganizationMeasureDTO> findAllOrganizationMeasure() throws DataAccessException {
        try {
            List<OrganizationMeasureEntity> omLst = em.createNamedQuery("OrganizationMeasure.findAll").getResultList();

            List<OrganizationMeasureDTO> retLst = new ArrayList<>();
            if (omLst != null && omLst.size() > 0) {
                omLst.forEach(Errors.rethrow().wrap(om -> {
                    OrganizationMeasureDTO dto = this.mapEntityToDTO(om);
                    retLst.add(dto);
                }));
            }

            return retLst;
        } catch (Exception e) {
            log.logp(Level.SEVERE, this.getClass().getName(), "findAllOrganizationMeasure", e.getMessage(), e);
            throw new DataAccessException(e);
        }
    }


    @Override
    public List<OrganizationMeasureDTO> findAllOrganizationMeasureByOrgId(int orgId) throws DataAccessException {
        try {
            OrganizationEntity oe = em.find(OrganizationEntity.class, orgId);
            List<OrganizationMeasureEntity> omLst = em.createNamedQuery("OrganizationMeasure.findAllByOrgId")
                    .setParameter("org", oe)
                    .getResultList();

            List<OrganizationMeasureDTO> retLst = new ArrayList<>();
            if (omLst != null && omLst.size() > 0) {
                omLst.forEach(Errors.rethrow().wrap(om -> {
                    OrganizationMeasureDTO dto = this.mapEntityToDTO(om);
                    retLst.add(dto);
                }));
            }

            return retLst;
        } catch (Exception e) {
            log.logp(Level.SEVERE, this.getClass().getName(), "findAllOrganizationMeasureByOrgId", e.getMessage(), e);
            throw new DataAccessException(e);
        }
    }

    @Override
    protected OrganizationMeasureEntity mapDtoToEntity(OrganizationMeasureEntity et, OrganizationMeasureDTO dto) {
        et.setAge1844Num(dto.getAge1844Num());
        et.setAge1844Den(dto.getAge1844Den());
        et.setAge4564Num(dto.getAge4564Num());
        et.setAge4564Den(dto.getAge4564Den());
        et.setAgeOver65Num(dto.getAgeOver65Num());
        et.setAgeOver65Den(dto.getAgeOver65Den());
        et.setAgeUnder17Num(dto.getAgeUnder17Num());
        et.setAgeUnder17Den(dto.getAgeUnder17Den());
        et.setDenominatorValue(dto.getDenominatorValue());
        et.setEthnicityHispanicLatinoNum(dto.getEthnicityHispanicLatinoNum());
        et.setEthnicityHispanicLatinoDen(dto.getEthnicityHispanicLatinoDen());
        et.setEthnicityNotHispanicLatinoNum(dto.getEthnicityNotHispanicLatinoNum());
        et.setEthnicityNotHispanicLatinoDen(dto.getEthnicityNotHispanicLatinoDen());
        et.setGenderFemaleNum(dto.getGenderFemaleNum());
        et.setGenderFemaleDen(dto.getGenderFemaleDen());
        et.setGenderMaleNum(dto.getGenderMaleNum());
        et.setGenderMaleDen(dto.getGenderMaleDen());
        et.setGenderOtherNum(dto.getGenderOtherNum());
        et.setGenderOtherDen(dto.getGenderOtherDen());
        et.setId(dto.getId());
        et.setNumeratorValue(dto.getNumeratorValue());
        et.setRaceAfricanAmericanNum(dto.getRaceAfricanAmericanNum());
        et.setRaceAfricanAmericanDen(dto.getRaceAfricanAmericanDen());
        et.setRaceAmericanIndianNum(dto.getRaceAmericanIndianNum());
        et.setRaceAmericanIndianDen(dto.getRaceAmericanIndianDen());
        et.setRaceAsianNum(dto.getRaceAsianNum());
        et.setRaceAsianDen(dto.getRaceAsianDen());
        et.setRaceNativeHawaiianNum(dto.getRaceNativeHawaiianNum());
        et.setRaceNativeHawaiianDen(dto.getRaceNativeHawaiianDen());
        et.setRaceOtherNum(dto.getRaceOtherNum());
        et.setRaceOtherDen(dto.getRaceOtherDen());
        et.setRaceWhiteNum(dto.getRaceWhiteNum());
        et.setRaceWhiteDen(dto.getRaceWhiteDen());
        et.setReportPeriodQuarter(dto.getReportPeriodQuarter());
        et.setReportPeriodYear(dto.getReportPeriodYear());
        et.setRpDate(dto.getRpDate());

        // Organization
        OrganizationEntity org = em.find(OrganizationEntity.class, dto.getOrganizationId());
        et.setOrganizationByOrganizationId(org);

        // Measure
        MeasureEntity measure = em.find(MeasureEntity.class, dto.getMeasureId());
        et.setMeasureByMeasureId(measure);

        // User
        UserEntity user = em.find(UserEntity.class, dto.getUserId());
        et.setUserByUserId(user);

        // Return
        return et;
    }

    @Override
    protected Class<OrganizationMeasureEntity> getGenericEntityClass() throws Exception {
        return OrganizationMeasureEntity.class;
    }

    @Override
    protected OrganizationMeasureDTO mapEntityToDTO(OrganizationMeasureEntity e) throws Exception {
        OrganizationMeasureDTO d = new OrganizationMeasureDTO();
        d.setAge1844Num(e.getAge1844Num());
        d.setAge1844Den(e.getAge1844Den());
        d.setAge4564Num(e.getAge4564Num());
        d.setAge4564Den(e.getAge4564Den());
        d.setAgeOver65Num(e.getAgeOver65Num());
        d.setAgeOver65Den(e.getAgeOver65Den());
        d.setAgeUnder17Num(e.getAgeUnder17Num());
        d.setAgeUnder17Den(e.getAgeUnder17Den());
        d.setDenominatorValue(e.getDenominatorValue());
        d.setEthnicityHispanicLatinoNum(e.getEthnicityHispanicLatinoNum());
        d.setEthnicityHispanicLatinoDen(e.getEthnicityHispanicLatinoDen());
        d.setEthnicityNotHispanicLatinoNum(e.getEthnicityNotHispanicLatinoNum());
        d.setEthnicityNotHispanicLatinoDen(e.getEthnicityNotHispanicLatinoDen());
        d.setGenderFemaleNum(d.getGenderFemaleNum());
        d.setGenderFemaleDen(d.getGenderFemaleDen());
        d.setGenderMaleNum(e.getGenderMaleNum());
        d.setGenderMaleDen(e.getGenderMaleDen());
        d.setGenderOtherNum(e.getGenderOtherNum());
        d.setGenderOtherDen(e.getGenderOtherDen());
        d.setId(e.getId());
        d.setNumeratorValue(e.getNumeratorValue());
        d.setRaceAfricanAmericanNum(e.getRaceAfricanAmericanNum());
        d.setRaceAfricanAmericanDen(e.getRaceAfricanAmericanDen());
        d.setRaceAmericanIndianNum(e.getRaceAmericanIndianNum());
        d.setRaceAmericanIndianDen(e.getRaceAmericanIndianDen());
        d.setRaceAsianNum(e.getRaceAsianNum());
        d.setRaceAsianDen(e.getRaceAsianDen());
        d.setRaceNativeHawaiianNum(e.getRaceNativeHawaiianNum());
        d.setRaceNativeHawaiianDen(e.getRaceNativeHawaiianDen());
        d.setRaceOtherNum(e.getRaceOtherNum());
        d.setRaceOtherDen(e.getRaceOtherDen());
        d.setRaceWhiteNum(e.getRaceWhiteNum());
        d.setRaceWhiteDen(e.getRaceWhiteDen());
        d.setId(e.getId());
        d.setMeasureId(e.getMeasureByMeasureId().getId());
        d.setOrganizationId(e.getOrganizationByOrganizationId().getId());
        d.setUserId(e.getUserByUserId().getId());
        d.setReportPeriodQuarter(e.getReportPeriodQuarter());
        d.setReportPeriodYear(e.getReportPeriodYear());
        d.setRpDate(e.getRpDate());
        return d;
    }
}
